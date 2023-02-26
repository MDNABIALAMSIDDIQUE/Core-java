package test;

import java.util.Scanner;

public class LoopProgram {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the any Number");
		int num=scanner.nextInt();
		
		for (int i = 1; i <= num; i++)
		{
			System.out.print(" "+i);
		}
		
	}
}
