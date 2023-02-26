package com.Shorting;

import java.util.ArrayList;
import java.util.Collections;

public class DesceShot {
public static void main(String[] args) {
	
	ArrayList<String> arrayList= new ArrayList<>();
	arrayList.add("Patna");
	arrayList.add("Gaya");
	arrayList.add("Darbhanga");
	arrayList.add("Bihar");
	arrayList.add("India");
	
	System.out.println("Befor shorting");
	for (String string : arrayList) {
		
		System.out.println(string);
		
	}
		Collections.sort(arrayList,Collections.reverseOrder());
	System.out.println("====================");
		System.out.println("After Shoting");
		
		for (String string2 : arrayList) {
			
			System.out.println(string2);
		
	}
}
}
