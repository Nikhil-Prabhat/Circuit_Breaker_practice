package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CircuitBreakerBookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerBookStoreApplication.class, args);
	}
	
	
	@RequestMapping(value="/recommended")
	public String readingList()
	{
		return "Yes, I am learning Spring Boot";
	}

}
