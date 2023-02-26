package reverse.string.com;

import java.util.Scanner;

public class ReversString_04 {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the String...");
		
		String string=scanner.nextLine();
		
		byte [] strbyte = string.getBytes();
		byte [] res=new byte[strbyte.length];
		
		for (int i = 0; i < res.length; i++) {
			res[i]=strbyte[strbyte.length-i-1];
			}
		System.out.println(new String(res));
	}

}
