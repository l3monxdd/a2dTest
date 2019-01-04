package com.company.app2driveTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.company.app2driveTest.controller",
		"com.company.app2driveTest.service",
		"com.company.app2driveTest.serviceImpl"})
@EntityScan({"com.company.app2driveTest.entity"})
@EnableJpaRepositories("com.company.app2driveTest.dao")
@SpringBootApplication
public class App2driveTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(App2driveTestApplication.class, args);
	}

}

