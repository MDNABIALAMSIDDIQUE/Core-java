package com.exception;

public class ExceptionHandling_01 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("I am try");
			System.exit(0);
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("I am finally");
		}
	}

}
