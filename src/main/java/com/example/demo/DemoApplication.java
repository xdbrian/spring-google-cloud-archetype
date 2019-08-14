package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({
		"com.example.demo",
		"com.example.demo.config",
		"com.example.demo.expose",
		"com.example.demo.external",
		"com.example.demo.model",
		"com.example.demo.service",
		"com.example.demo.impl",
})
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
