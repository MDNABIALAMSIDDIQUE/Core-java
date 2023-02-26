package com.exception;

public class ExceptionHandling_05 {
	
	public static void main(String[] args) {
		
		System.out.println("this is Mthod Call "+name());
		
	}
	
	@SuppressWarnings("finally")
	public static int name() {
		try {
			System.out.println(10/0);
			return 111;
		} 
		catch (ArithmeticException e)
		{
			e.printStackTrace();
			return 888;
			
		}
		finally {
			System.out.println("i am finally.. block");
			return 8888;
		}
		
		
	}

}
