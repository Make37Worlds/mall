package com.mall.mallmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.mall.mallmember.util.JwtUtils.createTokenById;

@SpringBootApplication(scanBasePackages = "com.mall.mallmember")
public class MallMemberApplication {

    public static void main(String[] args) throws Exception {
        System.out.println(createTokenById("1", "mall-member/src/main/java/com/mall/mallmember/util/private_key.pem"));
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
