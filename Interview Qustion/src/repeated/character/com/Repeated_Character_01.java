package repeated.character.com;

import java.util.Scanner;

public class Repeated_Character_01 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Any Word....");
		String string= scanner.nextLine();
		
		for(char i:string.toCharArray()) {
			if (string.indexOf(i) == string.lastIndexOf(i)) {
				System.out.println("This word Not Repeated..    "+i);
				
			}
		}
	}

}
