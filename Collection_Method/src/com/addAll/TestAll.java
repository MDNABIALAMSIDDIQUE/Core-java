package com.addAll;

import java.util.HashSet;

public class TestAll {

	public static void main(String[] args) {
		HashSet hSet = new HashSet();
		
		System.out.println(hSet);
		
		hSet.add("A");
		hSet.add("B");
		hSet.add("C");
		
		System.out.println(hSet);
		
		HashSet hSet2 = new HashSet();
		System.out.println(hSet2);
		System.out.println(hSet2.addAll(hSet));
		hSet2.add("P");
		System.out.println(hSet2);
	}
}
