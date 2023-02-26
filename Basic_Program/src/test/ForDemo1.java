package test;

import java.util.Scanner;

public class ForDemo1 {

	public static void main(String[] args) {
		long p;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any Number of Table");
		long n = scanner.nextInt();
		for (int i = 0; i <=10; i++)
		
		{
			p=n*i;
			System.out.println(n+" * "+i+" = "+p);
		}
		
		
		
	}

}
