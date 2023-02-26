package com.test;

	class A{
		
	}
	class B extends A{
		
	}



public class ClassCast_Ex {
	public static void main(String[] args) {
		
		A a=new A();
		System.out.println(a);
		B b=(B)a;
		
	}
}
