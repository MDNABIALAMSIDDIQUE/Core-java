package com.exception;

public class ExceptionHandling_06 {
	public static void main(String[] args) {
		
		try {
			System.out.println("First Number"+10/0);
		} catch (ArithmeticException e) {
			try {
				System.out.println(10/0);
			} catch (Exception e2) {
				e.printStackTrace();
			}
		}
		finally {
			String string= null;
			System.out.println(string);		}
	}

}
