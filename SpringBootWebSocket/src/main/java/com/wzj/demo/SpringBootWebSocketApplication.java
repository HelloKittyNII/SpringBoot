package com.wzj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWebSocketApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebSocketApplication.class, args);
	}
}
