package test;

import java.util.Scanner;

public class Count {
	
	public static void main(String[] args) {
		
	
		
		int total[] = new int [256];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the any  String");
		String	string=scanner.nextLine();
		int lel =string.length();
		for (int i = 0; i < lel; i++) {
			total[(int)string.charAt(i)]++;
			
		}
		for (int i = 0; i < 256; i++) 
			
		{
			if(total[i]!=0)
			{
				System.out.println(" ");
				System.out.print((char)i+" ====== "+total[i]);
				System.out.println(" ");
			}
		}
	}

}
