package com.stackroute.gupshup.activitystreamservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ActivitystreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivitystreamApplication.class, args);
	}
}