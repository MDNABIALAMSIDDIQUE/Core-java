package com.test.throwss;

public class Throw_Ex {
	public static void main(String[] args) {
		String accNo=args[0];
		String accName=args[1];
		int pin_Num=Integer.parseInt(args[2]);
		String accType=args[3];
		
		System.out.println("Account Details........");
		System.out.println("***********************************");
		System.out.println("Account Number"+accNo);
		System.out.println("Account Name"+accName);
		System.out.println("Account Type"+accType);
		System.out.println("Account Pin Number"+pin_Num);
		
		if (pin_Num>=1000 && pin_Num<=9999) {
			
			System.out.println("Your Pin Number Vaild..."+pin_Num);
		} 
		else {
			System.out.println("Your Pin Number InValid.."+pin_Num);
		}
	}

}
