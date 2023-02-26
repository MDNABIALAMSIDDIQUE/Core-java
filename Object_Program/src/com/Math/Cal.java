package com.Math;

public class Cal {
	
	void fact(int a) {
		int fact=1;
		
		for (int i = 1; i <= a; i++) {
			
			fact=fact*i;
			
		}
		System.out.println("Factorial Total = "+fact);
	}

	public static void main(String[] args) {
		Cal cal=new Cal();
		cal.fact(5);
	}
}
