package com.mall.mallmember;

import org.apache.commons.codec.digest.DigestUtils;

public class Test {
    public static void main(String[] args) {
        String password = "password123";
        String hashedPassword = DigestUtils.sha256Hex(password);
        System.out.println(hashedPassword);
    }
}