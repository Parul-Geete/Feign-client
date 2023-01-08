package com.experian.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication
@EnableFeignClients(basePackages = "com.experian.client.feignclient")
public class ExperianClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperianClientApplication.class, args);
	}

}
