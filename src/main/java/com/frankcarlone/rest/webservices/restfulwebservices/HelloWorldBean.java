package com.frankcarlone.rest.webservices.restfulwebservices;

public class HelloWorldBean {
	
	private String message;

//	Constructor
	public HelloWorldBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWordBean [message=" + message + "]";
	}
	
	

}
