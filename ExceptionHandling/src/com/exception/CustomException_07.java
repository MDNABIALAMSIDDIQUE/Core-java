package com.exception;

@SuppressWarnings("serial")
class MyException extends Exception{
	
	public MyException(String s) {
		super(s);
	}
}


public class CustomException_07 {
	
	public static void main(String[] args) {
		
		try {
			throw new MyException("Custom Exception");
			
		} catch (MyException  e) {
			e.printStackTrace();
		}
	}

}
