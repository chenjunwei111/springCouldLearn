package com.example.springcouldconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class SpringcouldconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcouldconfigApplication.class, args);
	}

}
