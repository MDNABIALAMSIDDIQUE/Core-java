package com.Employee;

public class Employee {
	
	int Empid;
	String empName;
	float salary;
	
	void inputDate(int i,String name,float s) {
		Empid = i;
		empName = name;
		salary =s;
	}
	
	void DisplayData() {
		System.out.println(Empid+" "+empName+" "+salary);
	}

}
