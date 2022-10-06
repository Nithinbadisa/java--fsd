package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class AmazonEc2Application {

	public static void main(String[] args) {
		SpringApplication.run(AmazonEc2Application.class, args);
	}

}
