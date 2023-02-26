package com.exception;

@SuppressWarnings("serial")
public class CustomException2 extends RuntimeException{
	
	public CustomException2(String string) {
		super(string);
		System.out.println("CustomException ... 2");
	}

}
