package com.ljnan.zbxt.config;

/**
 * @author lijianan
 * @date 2020-04-27 21:03
 * @description
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class swagger2Config {
    @Bean
    public Docket docket(){
        ApiInfo apiInfo = new ApiInfoBuilder().description("招标管理").
                title("招标管理系统").version("1.0").build();
        return new Docket(DocumentationType.SWAGGER_2).groupName("招标管理").apiInfo(apiInfo)
                .select().apis(RequestHandlerSelectors.basePackage("com.ljnan.zbxt"))
                .paths(PathSelectors.any()).build();
    }
}
