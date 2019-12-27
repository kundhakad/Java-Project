package com.reactFirstDemo.reactFirstDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.reactFirstDemo.reactFirstDemo")
public class ReactFirstDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactFirstDemoApplication.class, args);
		System.out.println("Application Started");
	}

}
