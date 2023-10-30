package com.mall.mallmember.config.shiro;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author hxf
 * @version 1.0
 * description:
 * Copyright (C), 2019 by 四川成电大为科技有限公司
 * date：2020/5/12 10:53
 * history:
 */
@Component
public class SpringContextHolder implements ApplicationContextAware {
    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    /**
     * 获取 spring bean
     * @param clazz     bean 类
     * @param <T>       类型
     * @return          返回 BEAN 结果
     */
    public static <T> T getBean(Class<T> clazz) {
        return context.getBean(clazz);
    }
}
