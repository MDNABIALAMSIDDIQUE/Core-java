package numberReverse;

import java.util.Scanner;

public class Reverse_Number_Program {
	
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Any For Reverse Number");
		
		int num=scanner.nextInt();
		System.out.println("**************************************");
		System.out.println("This is your Number"+num);
		System.out.println("*************************************");
		
		int reverse=0;
		
		while(num !=0) {
		int	remander = num % 10;
		
		num=num/10;
			reverse = reverse * 10 + remander;
			
		}
		
		System.out.println("This Number is Reverse   "+reverse);
		
		
	}

}
