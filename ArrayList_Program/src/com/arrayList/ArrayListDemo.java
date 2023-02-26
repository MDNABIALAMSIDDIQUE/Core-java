package com.arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList arrayList=new ArrayList();
		System.out.println("Array Capcity  "+arrayList);
		//System.out.println(arrayList);
		arrayList.add("aa");
		arrayList.add("BB");
		arrayList.add("CC");
		arrayList.add(2, "NN");
		arrayList.add("ZZ");
		System.out.println(arrayList.size());
		System.out.println(arrayList);
		arrayList.remove(4);
		System.out.println(arrayList);
		
		
	}
	
	

}
