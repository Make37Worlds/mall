package com.mall.mallmember.config.shiro;

import com.mall.mallmember.config.jwt.JwtToken;
import com.mall.mallmember.entity.Member;
import com.mall.mallmember.mapper.MemberMapper;
import com.mall.mallmember.service.IMemberService;
import com.mall.mallmember.util.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;


@Slf4j
public class AuthRealm extends AuthorizingRealm {
    @Resource
    private IMemberService userService;
    @Resource
    private MemberMapper userMapper;

    @Value("${token.name}")
    private String tokenKey;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    /**
         * @Description 授权认证
    */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        return authorizationInfo;
    }

    /**
         * @Description 登陆认证
         *  加密
         * @return org.apache.shiro.authc.AuthenticationInfo
    */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //getCredentials getPrincipal getToken 都是返回jwt生成的token串
        String token = (String) authenticationToken.getCredentials();
        String userId = JwtUtils.getUserId(token);
        if (userId == null) {
            throw new AccountException("token invalid");
        }
        // 查询数据库，判断用户是否存在
        Member user =userMapper.selectById(Integer.valueOf(userId));
        if(user == null){
            throw new AuthenticationException("用户不存在");
        }
        return new SimpleAuthenticationInfo(token, token, getName());
    }
}
