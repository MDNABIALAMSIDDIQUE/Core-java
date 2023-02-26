
package com.exception;

public class ExceptionHandling_03 {
	public static void main(String[] args) {
		
		try {
			System.out.println("I am try block");
		} catch (Exception e) {
			System.out.println("I am catch block");
			// TODO: handle exception
		}
		finally {
			System.out.println("I am finally Block");
		}
	}
}
