package com.example.department_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories(basePackages = "com.example.department_service.repository")
@EntityScan(basePackages = "com.example.department_service.entity")
public class DepartmentServiceApplication {

	public static void main(String[] args) {
	    try {
	        SpringApplication.run(DepartmentServiceApplication.class, args);
	    } catch (Exception e) {
	        e.printStackTrace();

	    }
	}
}
