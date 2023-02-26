package com.Bank;

public class Account {
	int acc_no;
	String name;
	float ammount;
	
	void insert(int a,String n,float amt) {
		
		acc_no = a;
		name= n;
		ammount=amt;
	}
	
	void Dipost( float amt) {
		ammount=ammount+amt;
		System.out.println(amt+"Deposited Amount");
	}
	
	void Withdrow(float amt) {
		
		if (ammount<amt) {
			System.out.println("Insufficient Balance");
		}
		else {
			ammount=ammount-amt;
			System.out.println(amt+"withdrawn Amount");
		}
	}
	
	void CheckBalance() {
		System.out.println("Your Total Balance "+ammount);
	}
	
	void Display() {
		System.out.println(acc_no +" "+name+" "+ammount);
	}
	
	

}
