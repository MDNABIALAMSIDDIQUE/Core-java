package com.Employee;

public class EmployeeMain {
	
	public static void main(String[] args) {
		System.out.println("*******************");
		Employee employee = new Employee();
		
		System.out.println(employee);
		System.out.println("*******************");
		employee.inputDate(4455, "MD NABI ALAM", 80000);
		employee.DisplayData();
		
	}

}
