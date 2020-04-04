package com.frankcarlone.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Annotation - Controller to handle GET request
@RestController
public class HelloWorldController {
	
//	Creating a GET request 
//	URI - /hello-world
	
//	Map GET request to URI
//	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	@GetMapping(path="/hello-world")
//	Method to create "Hello World"
	public String helloWorld() {
		return "Hello World";
	}
	
//	Create a bean and return it back
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}

}
