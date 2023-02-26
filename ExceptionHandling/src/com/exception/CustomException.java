package com.exception;

@SuppressWarnings("serial")
public class CustomException extends RuntimeException {
	
	public CustomException(CustomException string) {
		
		super(string);
		
		 System.out.println("Custom Exception...1");
		 
	}
	
	}

	
