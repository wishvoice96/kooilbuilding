package com.kooilBuilding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = "com.kooilBuilding")
@SpringBootApplication
public class KooilBuildingApplication {

	public static void main(String[] args) {
		SpringApplication.run(KooilBuildingApplication.class, args);
	}
}
