package reverse.string.com;

import java.util.Scanner;

public class ReversString_02 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String .....");
		String string=scanner.nextLine();
		StringBuffer stringBuffer= new StringBuffer();
		stringBuffer.append(string);
		stringBuffer=stringBuffer.reverse();
		
		for (int i = 0; i < stringBuffer.length(); i++) {
			System.out.print(stringBuffer.charAt(i));
		}
	}

}
