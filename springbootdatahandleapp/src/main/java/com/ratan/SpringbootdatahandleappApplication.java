package com.ratan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
@ComponentScan(basePackages = "com.ratan")
public class SpringbootdatahandleappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdatahandleappApplication.class, args);
	}

	
	
}
