package com.testbean.demo;

 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

import com.testbean.model.DynamicName;
 
/**
 * Test Bean Scopes and AspectJ
 * request: localhost:8080/test/{testParam}
 *
 * 
 * */
@SpringBootApplication
@ComponentScan(basePackages= {"com.testbean.controller", "com.testbean.model", "com.testbean.service", "com.testbean.aspect"})
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
	
	
}
