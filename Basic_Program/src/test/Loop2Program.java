package test;

import java.util.Scanner;

public class Loop2Program {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new  Scanner(System.in);
		System.out.println("Enter the Fist Number");
		int num= scanner.nextInt();
		System.out.println("Ente the 2nd Number");
		int num1= scanner.nextInt();
		
		for (int j = 1; j <=num; j++) {
			
			for (int i = 1; i <= num1; i++) {
				System.out.println(i+"  "+j);
			}
		}

	}
}
