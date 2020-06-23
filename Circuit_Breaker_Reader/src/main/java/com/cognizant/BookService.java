package com.cognizant;

import java.net.URI;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class BookService 
{
	//private final RestTemplate restTemplate;
	
	public BookService()
	{
		//this.restTemplate = rest;
	}
	
	@HystrixCommand(fallbackMethod = "reliable")
	public String readingList()
	{
		RestTemplateBuilder b = new RestTemplateBuilder();
		RestTemplate restTemplate = b.build();
		URI uri = URI.create("http://localhost:8090/recommended");
		return restTemplate.getForObject(uri, String.class);
	}
	
	public String reliable()
	{
		return "Sorry folks";
	}
	
	

}
