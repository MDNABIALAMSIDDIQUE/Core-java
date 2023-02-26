package test2;

import java.io.Serializable;

public class WriteFile_Object implements Serializable{
	
	private long ANo;
	private  String UserName;
	private String Password;
	private double Balance;
	
	
	public long getANo() {
		return ANo;
	}
	public void setANo(long aNo) {
		ANo = aNo;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	
	

}
