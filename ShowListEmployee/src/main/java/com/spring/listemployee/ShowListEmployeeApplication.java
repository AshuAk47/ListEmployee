package com.spring.listemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ShowListEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShowListEmployeeApplication.class, args);
	}

}
