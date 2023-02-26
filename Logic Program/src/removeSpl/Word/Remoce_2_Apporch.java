package removeSpl.Word;

import java.util.Scanner;

public class Remoce_2_Apporch {
	public static void main(String[] args) {
		
		System.out.println("Enter the Any Word with Spacle sysmbol");
		
		Scanner scanner = new Scanner(System.in);
		
		String string = scanner.nextLine();
		string = string.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(string);
		
		
	}
}
