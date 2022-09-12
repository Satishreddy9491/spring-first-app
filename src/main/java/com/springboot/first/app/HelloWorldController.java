package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //@RestController is the combination of @Controller and @ResponceBody

public class HelloWorldController {
	//GET HTTP method
	//http://localhost:8080/hello-world
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/hello")
	public String helo() {
		return "hello !";
	}
	@GetMapping("/satish")
	public String satish() {
		return "Hii Satish reddy";
	}
}
