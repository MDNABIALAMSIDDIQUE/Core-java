package com.java08;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Runnable runnable=()->{
			for (int i = 0; i <=10; i++) {
				System.out.println("I am Chaid Therd..");
			}
		};
		
		Thread thread = new Thread();
		thread.start();
		for (int i = 0; i <=10; i++) {
			System.out.println("I am Main Therd..");
		}
	}

}
