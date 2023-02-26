package com.Student;

public class StudentMain {
	public static void main(String[] args) {
		
		Student student= new Student();
		Student st=new Student();
		System.out.println(student);
		
		
		student.id=1001;
		student.name="Zohan";
		
		st.id=1002;
		st.name="NABI";
		
		System.out.println(student.id);
		System.out.println(student.name);
		System.out.println("**********************");
		System.out.println(st);
		System.out.println(st.id);
		System.out.println(st.name);
		
		
	}
}
