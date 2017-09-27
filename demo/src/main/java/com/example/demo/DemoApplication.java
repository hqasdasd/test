package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private String age;
	private char sex;
	private String name;
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}
}
