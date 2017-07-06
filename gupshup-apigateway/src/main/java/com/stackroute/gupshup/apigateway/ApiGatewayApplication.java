package com.stackroute.gupshup.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableResourceServer
public class ApiGatewayApplication 
{

    public static void main(String[] args) 
    {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
