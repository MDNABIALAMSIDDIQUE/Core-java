package test;

import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter upto last Counting");
		long i = 1;
		while (i<=10) {
			System.out.print(" "+i+"");
			i++;
		}
	}
}
