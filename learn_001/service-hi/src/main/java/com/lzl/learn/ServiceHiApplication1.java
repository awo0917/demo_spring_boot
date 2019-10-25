package com.lzl.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceHiApplication1 {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication1.class, args);
	}

}
