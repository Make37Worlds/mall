package com.mall.mallmember.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
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
         * @Description 创建token
         * @param userId
    	 * @param password
         * @throws
         * @return java.lang.String
    */
    public static String createTokenFirstEdition(String userId, String password) {
        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        //加密处理密码
        Algorithm algorithm = Algorithm.HMAC256(password);
        return JWT.create()
                .withClaim(CLAIM_ID, userId)//需要存入的用户信息
                .withExpiresAt(date)
                .sign(algorithm);
    }

    // 从字符串加载私钥
    private static RSAPrivateKey getPrivateKey(String filename) throws Exception {
        String privateKey = Files.readString(Paths.get(filename))
                .replace("-----BEGIN PRIVATE KEY-----", "")
                .replaceAll(System.lineSeparator(), "")
                .replace("-----END PRIVATE KEY-----", "");

        byte[] pkcs8EncodedBytes = Base64.getDecoder().decode(privateKey);
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(pkcs8EncodedBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return (RSAPrivateKey) keyFactory.generatePrivate(keySpec);
    }

    // 创建Token
    public static String createTokenById(String userId, String privateKeyPem) throws Exception {
        RSAPrivateKey privateKey = getPrivateKey(privateKeyPem);
        Algorithm algorithm = Algorithm.RSA256(null, privateKey);

        // 设置Token的过期时间
        Date issuedAt = new Date(System.currentTimeMillis());
        Date expiresAt = new Date(issuedAt.getTime() + EXPIRE_TIME); // 1小时后过期

        // 创建Token
        return JWT.create()
                .withIssuer("auth0")
                .withClaim("userId", userId)
                .withIssuedAt(issuedAt)
                .withExpiresAt(expiresAt)
                .sign(algorithm);
    }

    /**
         * @Description 验证登录用户名和密码是否正确
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
         * @Description 根据token查询用户名
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

    public static Date getDateFromToken(String token) {
        DecodedJWT jwt = JWT.decode(token);
        return jwt.getExpiresAt();
    }
}
