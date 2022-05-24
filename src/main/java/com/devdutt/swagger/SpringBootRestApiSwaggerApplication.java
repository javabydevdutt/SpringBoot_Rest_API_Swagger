package com.devdutt.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class SpringBootRestApiSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiSwaggerApplication.class, args);
	}

}
