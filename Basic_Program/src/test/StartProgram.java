package test;

import java.util.Scanner;

public class StartProgram {
public static void main(String[] args) {
	
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Number Start ");
	int st = scanner.nextInt();
	
	for (int i=1;i<=st;i++) {
			
		for (int j=st;j>=i;j--) {
			
			System.out.print(" * ");
			
		}
		System.out.println();
	}
	
}
}
