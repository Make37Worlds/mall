package com.mall.mallproduct.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.mall.mallproduct.mapper")
public class MyBatisPlusConfig {

}
