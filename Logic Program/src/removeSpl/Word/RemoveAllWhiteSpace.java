package removeSpl.Word;

import java.util.Scanner;

public class RemoveAllWhiteSpace {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Any Word");
		Scanner scanner=new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(string);
		
		
		string=string.replaceAll("\\s", "");
		System.out.println(string);
	}

}
