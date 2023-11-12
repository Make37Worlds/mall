package com.mall.mallwarehouse.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.mall.mallwarehouse.mapper")
public class MyBatisPlusConfig {

}
