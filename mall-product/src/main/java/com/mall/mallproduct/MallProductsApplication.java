package com.mall.mallproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.mall.mallproduct")
public class MallProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductsApplication.class, args);
    }

}
