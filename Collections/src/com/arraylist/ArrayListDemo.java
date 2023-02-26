package com.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<String>();
		System.out.println(arrayList);
		// add method
		arrayList.add("Patna");
		arrayList.add("Gaya");
		arrayList.add("Darbhanga");
		arrayList.add("Bihar");
		arrayList.add("India");
		System.out.println("********************************");
		System.out.println(arrayList);
		System.out.println("********************************");
		//Index base add method
		arrayList.add(0, "MD NABI ALAM");
		arrayList.add(1, "Bhindaspur");
		System.out.println("********************************");
		System.out.println(arrayList);
		System.out.println("********************************");
		// remove index base
		arrayList.remove(4);
		arrayList.remove(5);
		System.out.println("********************************");
		System.out.println(arrayList);
		System.out.println("********************************");
		
		
		
	}

}
