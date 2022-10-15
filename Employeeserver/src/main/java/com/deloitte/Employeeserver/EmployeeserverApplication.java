package com.deloitte.Employeeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EmployeeserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeserverApplication.class, args);
	}

}
