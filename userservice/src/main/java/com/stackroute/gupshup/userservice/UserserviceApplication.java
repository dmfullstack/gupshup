package com.stackroute.gupshup.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.stackroute.gupshup.userservice.consumer.UserConsumer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories
@EnableFeignClients
public class UserserviceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(UserserviceApplication.class, args);
		applicationContext.getBean(UserConsumer.class).subscribeUserActivity("user1");
	}
}
