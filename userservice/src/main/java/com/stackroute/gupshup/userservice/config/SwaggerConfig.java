package com.stackroute.gupshup.userservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
<<<<<<< HEAD
=======

import springfox.documentation.builders.PathSelectors;
>>>>>>> 0583b84e7f4bb934e6352cd8e4f89708778090fa
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
<<<<<<< HEAD
import static springfox.documentation.builders.PathSelectors.regex;
=======
>>>>>>> 0583b84e7f4bb934e6352cd8e4f89708778090fa

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.stackroute.gupshup.userservice.controller"))
<<<<<<< HEAD
                .paths(regex("/gupshup/user.*"))
=======
                .paths(PathSelectors.ant("/user/*"))
>>>>>>> 0583b84e7f4bb934e6352cd8e4f89708778090fa
                .build()
                .apiInfo(metaData());
    }
    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
<<<<<<< HEAD
                "Spring Boot GUPSHUP REST API",
                "Spring Boot REST API for Gupshup",
=======
                "Spring Boot USER REST API",
                "Spring Boot REST API for USER",
>>>>>>> 0583b84e7f4bb934e6352cd8e4f89708778090fa
                "1.0",
                "Terms of service",
                new Contact("Stack Route", "https://stackroute.in/", "simanta.sarma@stackroute.in"),
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0");
        return apiInfo;
    }
}