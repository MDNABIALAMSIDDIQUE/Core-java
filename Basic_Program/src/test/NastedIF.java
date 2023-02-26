package test;

import java.util.Scanner;

public class NastedIF {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the your  Age");
		int age=scanner.nextInt();
		System.out.println("Enter the your Weghit ");
		int weghit=scanner.nextInt();
		
		
		if (age>=18) {
			
			
			
			if (weghit>=60) {
				System.out.println("=================================");
				System.out.println("you Are eligible to donate blood ");
				System.out.println("=================================");
			}
			else {
				System.out.println("=================================");
				System.out.println("Your Weghit less than 60 kg");
				System.out.println("=================================");
				System.out.println("You are Not Eligible to donate Blood");
				System.out.println("=================================");
			}
		}
		else {
			System.out.println("=================================");
			System.out.println("Age Must be Areater than 18");
			System.out.println("=================================");
		}

	}

}
