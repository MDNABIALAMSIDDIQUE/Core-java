package com.test;
	
class AAA{
	static {
		System.out.println("Class Loding...");
	}
	AAA(int i){
		System.out.println("Obj Create..");
	}
}
public class Insta_Ex {
	public static void main(String[] args) {
		try {
			Class c=Class.forName("A");
			Object object =c.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
