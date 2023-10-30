package com.mall.mallmember.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * Swagger接口文档配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * Swagger接口文档配置
     * @param
     * @return Docket
     * @author xiaozhiwei
     * date: 2018/10/18 16:59
     */
    @Bean
    public Docket createRestApi() {
        try {
            ParameterBuilder tokenPar = new ParameterBuilder();
            List<Parameter> pars = new ArrayList<Parameter>();
            tokenPar.name("x-access-token").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
            pars.add(tokenPar.build());

            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.qh.eiiec.controller"))
                    .paths(PathSelectors.any())
                    .build()
                    .globalOperationParameters(pars)
                    .apiInfo(apiInfo());

        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }
    
    /**
     * API接口文档
     * @param
     * @return ApiInfo
     * @author xiaozhiwei
     * date: 2018/10/18 17:00
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("后台API接口文档")
                .description("EIIEC 评优辅助工具系统")
                //.termsOfServiceUrl("http://test.com/")
                .version("1")
                .build();
    }
}
