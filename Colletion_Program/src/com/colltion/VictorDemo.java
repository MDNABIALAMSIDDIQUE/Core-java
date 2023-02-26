package com.colltion;

import java.util.Vector;

public class VictorDemo {
	public static void main(String[] args) {
		
		Vector<String> vector= new Vector<String>();
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		vector.add("Java");
		vector.add("Oracle");
		vector.add(new String("Spring Boot"));
		vector.add("Spring");
		vector.add("Tools");
		System.out.println(vector);
		System.out.println(vector.size());
	}

}
