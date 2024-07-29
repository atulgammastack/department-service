package com.example.department_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentServiceApplication {

	public static void main(String[] args) {
	    try {
	        SpringApplication.run(DepartmentServiceApplication.class, args);
	        
	    } catch (Exception e) {
	    	System.out.println("sssssssssssssssssssssssssssssssssssssssssssfffffffgggggggggggggggggggggggg");
	        e.printStackTrace();
	    }
	}

}
