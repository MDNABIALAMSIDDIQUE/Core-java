package com.exception;

public class CustomExceptionNullPointer {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		try {
			
			String string =null;
			System.out.println(string.length());
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

}
