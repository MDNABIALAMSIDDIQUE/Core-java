package com.Tead;

public class ThedDemo extends Thread{
	
	public static void main(String[] args) {
		System.out.println("Wel COme to Class");
		try {
			System.out.println("M");
			Thread.sleep(1200);
			System.out.println("D");
			Thread.sleep(1200);
			System.out.println("N");
			Thread.sleep(1000);
			System.out.println("A");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
