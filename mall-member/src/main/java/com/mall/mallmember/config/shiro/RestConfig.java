package com.mall.mallmember.config.shiro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author hxf
 * @version 1.0
 * description:
 * Copyright (C), 2019 by 四川成电大为科技有限公司
 * date：2020/11/18 17:16
 * history:
 */
@Configuration
public class RestConfig {
    @Bean
    public RestTemplate restTemplate() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(30*1000);
        requestFactory.setReadTimeout(180*1000);
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        return restTemplate;
    }
}
