package com.mall.mallmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.mall.mallmember")
public class MallProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductsApplication.class, args);
    }

}
