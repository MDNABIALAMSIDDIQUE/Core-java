package com.exception;

public class ExceptionHandling_02 {
	public static void main(String[] args) {
		
		try {
			
			System.out.println(10/0);
			
		} 
		catch 
		(ArithmeticException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("so Sorry");
		}
	}
}
