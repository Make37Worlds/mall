package com.mall.mallmember.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author hxf
 * @version 1.0
 * description:
 * Copyright (C), 2019 by 四川成电大为科技有限公司
 * date：2020/5/11 16:42
 * history:
 */
@Component
public class JwtUtils {
    private static long EXPIRE_TIME;

    private static String CLAIM_ID;

    @Value("${token.expore_time}")
    public void setExpireTime(long expireTime) {
        EXPIRE_TIME = expireTime;
    }

    @Value("${token.userid}")
    public void setClaimId(String claimId) {
        CLAIM_ID = claimId;
    }

    /**
         * @Author hxf
         * @Description 创建token
         * @Date 2020/5/11 16:49
         * @param userId
    	 * @param password
         * @throws
         * @return java.lang.String
    */
    public static String createTokenById(String userId, String password) {
        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        //加密处理密码
        Algorithm algorithm = Algorithm.HMAC256(password);
        return JWT.create()
                .withClaim(CLAIM_ID, userId)//需要存入的用户信息
                .withExpiresAt(date)
                .sign(algorithm);
    }

    /**
         * @Author hxf
         * @Description 验证登录用户名和密码是否正确
         * @Date 2020/5/11 16:50
         * @param userId
    	 * @param dbPwd
    	 * @param token
         * @throws
         * @return boolean
    */
    public static boolean verifyById(String userId, String dbPwd, String token) {
        Algorithm algorithm = Algorithm.HMAC256(dbPwd);
        JWTVerifier jwtVerifier = JWT.require(algorithm)
                .withClaim(CLAIM_ID, userId)
                .build();
        try {
            jwtVerifier.verify(token);
        } catch (JWTVerificationException e) {
            return false;
        }
        return true;
    }

    /**
         * @Author hxf
         * @Description 根据token查询用户名
         * @Date 2020/5/11 16:50
         * @param token
         * @throws
         * @return java.lang.String
    */
    public static String getUserId(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim(CLAIM_ID).asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }
}
