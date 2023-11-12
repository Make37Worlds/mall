package com.mall.mallmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.javapoet.ClassName;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static com.mall.mallmember.util.JwtUtils.createTokenById;

@SpringBootApplication(scanBasePackages = "com.mall.mallmember")
public class MallMemberApplication {

    public static void main(String[] args) throws Exception {
        String token = createTokenById("1", "private_key.pem");
        System.out.println(token);
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
