package com.mall.mallmember.config.shiro;

import com.mall.mallmember.config.jwt.JwtFilter;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * description: Shiro配置类
 */
@Configuration
public class ShiroConfig {
    private static final String JWT_FILTER_NAME = "jwt";

    /**
         * @Author hxf
         * @Description 自定义realm
         * @Date 2020/5/9 17:00
         * @param
         * @return
    */
    @Bean(name = "authRealm")
    public Realm authRealm() {
        return new AuthRealm();
    }

    /**
         * @Author hxf
         * @Description 配置securityManager 管理subject（默认）,并把自定义realm交由manager
         * @Date 2020/5/9 17:01
         * @param
         * @return org.apache.shiro.mgt.DefaultSecurityManager
    */
    @Bean(name = "securityManager")
    public DefaultSecurityManager securityManager(@Qualifier("authRealm") Realm authRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(authRealm);
        //非web关闭sessionManager(官网有介绍)
        // http://shiro.apache.org/session-management.html#SessionManagement-StatelessApplications%28Sessionless%29
        DefaultSubjectDAO defaultSubjectDAO = new DefaultSubjectDAO();
        DefaultSessionStorageEvaluator storageEvaluator = new DefaultSessionStorageEvaluator();
        storageEvaluator.setSessionStorageEnabled(false);
        defaultSubjectDAO.setSessionStorageEvaluator(storageEvaluator);
        securityManager.setSubjectDAO(defaultSubjectDAO);

        return securityManager;
    }

    @Bean(name = "shiroFilterFactoryBean")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultSecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        shiroFilterFactoryBean.setFilters(filterMap());//定义拦截器。哪些请求走哪些拦截。比如jwt
        shiroFilterFactoryBean.setFilterChainDefinitionMap(definitionMap());

        return shiroFilterFactoryBean;
    }


    /**
     * 自定义拦截器，处理所有请求
     */
    private Map<String, Filter> filterMap() {
        Map<String, Filter> filterMap = new LinkedHashMap<>();
        filterMap.put(JWT_FILTER_NAME, new JwtFilter());
        return filterMap;
    }

    /**
     * url拦截规则
     * anon:无需认证，就可以访问
     * outhc:必须认证
     * user:必须拥有“记住我”才能访问
     * perms：拥有某个资源的权限才能访问
     * role：拥有某个角色权限才能访问
     */
    private Map<String, String> definitionMap() {
        Map<String, String> definitionMap = new LinkedHashMap<>();
        // Swagger接口文档
        definitionMap.put("/v2/api-docs", "anon");
        definitionMap.put("/webjars/**", "anon");
        definitionMap.put("/swagger-resources/**", "anon");
        definitionMap.put("/swagger-ui.html", "anon");
        definitionMap.put("/doc.html", "anon");

        // 配置url是否需要认证
        definitionMap.put("/login", "anon");
//        definitionMap.put("/activity/**", "anon");
//        definitionMap.put("/model/**", "anon");
        definitionMap.put("/**", JWT_FILTER_NAME);

        return definitionMap;
    }

    /**
     * 开启注解
     */
    @Bean
    @DependsOn("lifecycleBeanPostProcessor")
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        // 强制使用cglib代理，防止和aop冲突
        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
        return defaultAdvisorAutoProxyCreator;
    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    @Bean("authorizationAttributeSourceAdvisor")
    public AuthorizationAttributeSourceAdvisor advisor(DefaultSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }
}
