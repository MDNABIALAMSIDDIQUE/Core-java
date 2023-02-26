package interview.com;

import java.util.Scanner;

public class FindPower {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number....");
		long b=scanner.nextLong();
		System.out.println("Enter the Power Number....");
		long p= scanner.nextLong();
		long power=Power(b,p);
		System.out.println("Number = "+b+" Power = "+p);
		System.out.println("Total Powar of Nubmer =  "+power);
	}

	private static long Power(long b, long p) {
		long power=1;
		for (long i = 1; i  <=p; i++) {
			power = power*b;
		}
		
		return power;
	}

}
