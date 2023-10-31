package com.mall.mallproduct.controller;

import com.mall.mallproduct.constants.enums.ResultCode;
import com.mall.mallproduct.entity.Member;
import com.mall.mallproduct.entity.ResultInfo;
import com.mall.mallproduct.entity.vo.MemberVo;
import com.mall.mallproduct.service.IMemberService;
import com.mall.mallproduct.util.JwtUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import org.apache.commons.codec.digest.DigestUtils;

@RestController
public class LoginController {

    @Autowired
    private IMemberService userService;

    @Value("${token.expore_time}")
    private Long EXPIRE_TIME;

    @PostMapping("/login")
    @ApiOperation(value = "用户登录")
    public ResultInfo login(@RequestBody Member userLogin) {
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
        String token = JwtUtils.createTokenById(userVo.getId().toString(),password);
        // 将user对象补充完整
        userVo.setToken(token);
        userVo.setCreateTime(new Date(System.currentTimeMillis()));
        userVo.setExpiration(String.valueOf(new Date(System.currentTimeMillis() + EXPIRE_TIME*1000).getTime()));
        return ResultInfo.success(userVo);
    }
}
