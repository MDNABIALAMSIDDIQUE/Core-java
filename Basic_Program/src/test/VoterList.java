package test;

import java.util.Scanner;

public class VoterList {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plz Enter  the your Age ");
		int age=scanner.nextInt();
	 
		
		
			if (age>=18  && age<=99)
			{
				System.out.println("WelCome to Voting System you can Vote");
			}
			else if (age>99)
			{
				System.out.println("Your Name Deleted of Voter List ");
			} 
		else 
				{
				int shrt=(18-age);
				System.out.println("Sorry,you can after :"+ shrt +"years");
			}
		}
		
		
	
}
