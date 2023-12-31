package com.mall.mallmember.controller;

import com.mall.mallmember.constants.enums.ResultCode;
import com.mall.mallmember.entity.Member;
import com.mall.mallmember.entity.ResultInfo;
import com.mall.mallmember.entity.vo.MemberVo;
import com.mall.mallmember.service.IMemberService;
import com.mall.mallmember.util.JwtUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.javapoet.ClassName;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.Date;
import org.apache.commons.codec.digest.DigestUtils;

import static com.mall.mallmember.util.JwtUtils.createTokenById;

@RestController
public class LoginController {

    @Autowired
    private IMemberService userService;

    @Value("${token.expore_time}")
    private Long EXPIRE_TIME;

    @PostMapping("/login")
    @ApiOperation(value = "用户登录")
    public ResultInfo login(@RequestBody Member userLogin) throws Exception {
        // 判断输入的用户名、密码不能为空
        String loginName =userLogin.getUsername();
        String password = userLogin.getPassword();
        if (loginName == null || loginName.isEmpty() || password == null || password.isEmpty()) {
            return ResultInfo.failure(ResultCode.LOGINNAME_PWD_NOT_EXIST);
        }
        password = DigestUtils.sha256Hex(password);
        // 查询数据库中对应的user对象，判断用户是否存在、密码是否正确
        MemberVo userVo = userService.getMemberVoByName(loginName);
        if(userVo == null || !password.equals(userVo.getPassword())){
            return ResultInfo.failure(ResultCode.USER_LOGIN_ERROR);
        }

        if(userVo.getStatus() == 1){
            //看注销没
            return ResultInfo.failure(ResultCode.USER_IS_CANCELLATION);
        }
        // 创建token
        String token = createTokenById(userVo.getId().toString(), "private_key.pem");
        // 将user对象补充完整
        userVo.setToken(token);
        userVo.setCreateTime(new Date(System.currentTimeMillis()));
        userVo.setExpiration(String.valueOf(new Date(System.currentTimeMillis() + EXPIRE_TIME*1000).getTime()));
        return ResultInfo.success(userVo);
    }
}
