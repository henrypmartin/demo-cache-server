package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.LocatorApplication;

@LocatorApplication
public class DemoCacheLocatorApplication {

	//spring.data.gemfire.locator.name
	//spring.data.gemfire.locator.port
	public static void main(String[] args) {
		SpringApplication.run(DemoCacheLocatorApplication.class, args);
		
		while(true);
	}

}
