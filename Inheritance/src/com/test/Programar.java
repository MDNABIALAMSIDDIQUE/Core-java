package com.test;

public class Programar extends Employee{
	
	int bouns=25000;
	
	public static void main(String[] args) {
		Programar programar = new Programar();
		
		System.out.println("Employee Saly   "+programar.sal);
		System.out.println("Employee bouns  "+programar.bouns);
	}

}
