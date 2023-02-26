package com.Bank;

public class Coustamar {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.insert(112233,"Zohan Hassan", 3000);
		
		account.Display();
		account.CheckBalance();
		account.Dipost(5000);
		account.CheckBalance();
		account.Withdrow(6000);
		account.CheckBalance();
		account.Withdrow(1000);
		account.CheckBalance();
		
		
	}
}
