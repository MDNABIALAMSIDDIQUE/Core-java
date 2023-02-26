package com.exception;

public class ExceptionHandling_04 {
	public static void main(String[] args) {
		
		try {
			System.out.println("I am try block...");
			System.out.println(10/0);
		} 
		catch
		(Exception e) {
			System.out.println("I am catch block...");
			return;
		}
		finally {
			System.out.println("I am finallu block..");
		}
	}

}
