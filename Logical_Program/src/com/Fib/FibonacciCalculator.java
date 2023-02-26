package com.Fib;

import java.util.Scanner;

public class FibonacciCalculator {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter the Fibonacci Number");
		int number;
		number = new Scanner(System.in).nextInt();
		System.out.println("This Number Fiboacci serices  "   +number+  "  NUmbers");
		
		for (int i = 1; i <=number; i++) {
			System.out.println(fibonacci2(i)+" ");
		}
	}
	
		public static int fibonacci(int number) {
			if (number ==1 || number ==2) {
				return 1;
			}
			return(fibonacci(number-1)+fibonacci(number-2));
		}
	
	
	
	public static int fibonacci2(int number) {
		
		if (number == 1 || number ==2) {
			return 1;
		}
		int fibo1 = 1,fibo2=1,fibonacci=1;
		for (int i = 3; i <=number; i++) {
			fibonacci=fibo1+fibo2;
			fibo1=fibo2;
			fibo2=fibonacci;
		}
		return fibonacci;
	}

}