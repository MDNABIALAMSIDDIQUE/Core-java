package march.com;

import java.util.Scanner;

public class ReverStringProgram {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the Any String ..");
		
		String revString=scanner.nextLine();
		byte[] str=revString.getBytes();
		byte[] rev=new byte[str.length];
		for (int i = 0; i < rev.length; i++) {
			rev[i]= str[str.length-i-1];
		}
		System.out.println(new String(rev));
	}
}
