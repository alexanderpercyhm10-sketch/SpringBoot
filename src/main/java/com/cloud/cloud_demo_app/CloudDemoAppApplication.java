package com.cloud.cloud_demo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.cloud.controller"})
public class CloudDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudDemoAppApplication.class, args);
	}

}
