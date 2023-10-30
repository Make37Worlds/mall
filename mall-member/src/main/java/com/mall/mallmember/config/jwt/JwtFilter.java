package com.mall.mallmember.config.jwt;

import com.alibaba.fastjson.JSON;
import com.mall.mallmember.common.RestResponse;
import com.mall.mallmember.constants.OAuthConstant;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * description: 自定义拦截器
 */
@Service
public class JwtFilter extends BasicHttpAuthenticationFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(JwtFilter.class);

    private static final String AUTHZ_HEADER = "x-access-token";
    private static final String CHARSET = "UTF-8";


    /**
     * 处理未经验证的请求
     */
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) {
        boolean loggedIn = false;
        boolean loginAttempt = this.isLoginAttempt(request, response);
        if (loginAttempt) {
            loggedIn = this.executeLogin(request, response);
        }

        if (!loggedIn) {
            this.sendChallenge(request, response);
        }

        return loggedIn;
    }

    /**
     * 请求是否已经登录（携带token）
     */
    @Override
    protected boolean isLoginAttempt(ServletRequest request, ServletResponse response) {
        String authzHeader = WebUtils.toHttp(request).getHeader(AUTHZ_HEADER);
        return authzHeader != null;
    }

    /**
     * 执行登录方法(由自定义realm判断,吃掉异常返回false)
     */
    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) {
        String token = WebUtils.toHttp(request).getHeader(AUTHZ_HEADER);
        if (null == token) {
            String msg = "executeLogin method token must not be null";
            throw new IllegalStateException(msg);
        }
        //交给realm判断是否有权限,没权限返回false交给onAccessDenied
        JwtToken jwtToken = new JwtToken(token);
        try {
            // shiro的Subject的login操作，会执行AuthRealm的登录认证方法doGetAuthenticationInfo
            this.getSubject(request, response).login(jwtToken);
            return true;
        } catch (AuthenticationException e) {
            return false;
        }
    }

    /**
     * 构建未授权的请求返回,filter层的异常不受exceptionAdvice控制,这里返回401,把返回的json丢到response中
     */
    @Override
    protected boolean sendChallenge(ServletRequest request, ServletResponse response) {
        HttpServletResponse httpResponse = WebUtils.toHttp(response);
        String contentType = "application/json;charset=" + CHARSET;
        httpResponse.setStatus(OAuthConstant.Code.OK);
        httpResponse.setContentType(contentType);
        try {
            String msg = "登录失效，请重新登录!";
            RestResponse unauthentication = RestResponse.newBuilder()
                    .setCode(OAuthConstant.Code.UNAUTHENTICATED)
                    .setMsg(msg).build();
            PrintWriter printWriter = httpResponse.getWriter();
            printWriter.append(JSON.toJSONString(unauthentication));
        } catch (IOException e) {
            LOGGER.error("sendChallenge error,can not resolve httpServletResponse");
        }

        return false;
    }

    /**
     * 请求前处理,处理跨域
     */
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse
                .setHeader("Access-control-Allow-Origin", httpServletRequest.getHeader("Origin"));
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");
        httpServletResponse.setHeader("Access-Control-Allow-Headers",
                httpServletRequest.getHeader("Access-Control-Request-Headers"));
        // 跨域时,option请求直接返回正常状态
        if (httpServletRequest.getMethod().equals(RequestMethod.OPTIONS.name())) {
            httpServletResponse.setStatus(HttpStatus.OK.value());
            return false;
        }
        return super.preHandle(request, response);
    }
}
