package com.test;


class SSA{
	
	static {
		System.out.println("Class Loading");
	}
}



public class Class_Not_Found_Ex {
	public static void main(String[] args) {
		
		try {
			Class class1=Class.forName("AAA");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
