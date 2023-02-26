package duplicate.Characters;

import java.util.Scanner;

public class Remove_Duplicate_Characters {
	
		public static void main(String[] args) {
			
			System.out.println("Enter the any Duplicate alphabeta Word ex= Apple");
			Scanner scanner = new Scanner(System.in);
			
			String string=scanner.nextLine();
			
			
			
			
			System.out.println("====================== StringBuilder ==================");
			StringBuilder stringBuilder = new StringBuilder();
			string.chars().distinct().forEach(c -> stringBuilder.append((char)c));
			System.out.println("====================== StringBuilder ==================");
			System.out.println(stringBuilder);
			System.out.println("====================== StringBuilder ==================");
			
			
		}

}
