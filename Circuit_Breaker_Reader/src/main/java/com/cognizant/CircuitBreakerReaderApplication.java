package com.cognizant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker
@RestController
@SpringBootApplication
public class CircuitBreakerReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerReaderApplication.class, args);
	}
	
	@Autowired
	private BookService bookService;
	
	//This restTemplate bean is created and passed to the bookservice as parameter
	//Both objects are in ioc container
	/*@Bean
	public RestTemplate rest(RestTemplateBuilder builder)
	{
		return builder.build();
	}
	*/
	@RequestMapping("/to-read")
	public String toRead()
	{
		return bookService.readingList();
	}

}
