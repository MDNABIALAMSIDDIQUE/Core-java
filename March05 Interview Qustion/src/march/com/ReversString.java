package march.com;

import java.util.Scanner;

public class ReversString {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the any String ....");
		
		String revString=scanner.nextLine();
		byte[] str=revString.getBytes();
		byte[] res=new byte[str.length];
		for (int i = 0; i < res.length; i++) {
			res[i]= str[str.length-i-1];
		}
		System.out.println(new String(res));
	}

}
