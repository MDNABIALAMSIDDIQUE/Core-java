package com.nit.math;

import java.util.Scanner;
import static java.lang.Math.*;

public class DemoStaticImport {

	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Any Number");
			double val = scanner.nextDouble();
			double d = sqrt(val);
			System.out.println(d);
			scanner.close();
		}
	
}
