package test;

import java.util.Scanner;

public class SwitchDemo {
public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Day Number");
			int day = scanner.nextInt();
		
			String dayname = "Try Again";
		
			switch (day) {
			
			case 1:
				dayname = "Today is Sunday";
				break;
				
			case 2:
				dayname="Today is Monday";
				break;
			case 3:
				dayname="Today is Tuesday";
				break;
			case 4:
				dayname="Today is Wednesday";
				break;
			case 5:
				dayname="Today is Thursday";
				break;
			case 6:
				dayname = "Today is Friday";
				break;
				
			case 7:
				dayname="Today is Saturday";
				break;
			
			default:
				System.out.println("Invalid Day's Number");
				
			}
			
			System.out.println(dayname);
			
}
}
