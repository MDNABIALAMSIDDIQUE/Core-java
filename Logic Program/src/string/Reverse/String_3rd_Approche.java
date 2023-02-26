package string.Reverse;

import java.util.Scanner;

public class String_3rd_Approche {
	
	public static void main(String[] args) {
		
		System.out.println("***************************************************");
		System.out.println("Welcome To This Program");
		System.out.println("***************************************************");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Any Words");
		String string=scanner.nextLine();
		System.out.println("***************************************************");
		System.out.println(string);
		System.out.println("***************************************************");
		
		System.out.println("==========================================");
		System.out.println("  StringBuffer  ");
		System.out.println("==========================================");
		
		StringBuffer stringBuffer= new StringBuffer(string);
		
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		
		System.out.println("==========================================");
		System.out.println("  StringBuilder  ");
		System.out.println("==========================================");
		StringBuilder stringBuilder= new StringBuilder(string);
		stringBuilder.reverse();
		System.out.println(stringBuilder);
	}

}
