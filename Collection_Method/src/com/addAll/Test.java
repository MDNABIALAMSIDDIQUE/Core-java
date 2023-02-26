package com.addAll;

import java.util.HashSet;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		HashSet hs= new HashSet();


		System.out.println(hs);
		System.out.println(hs.add("A"));
		hs.add("B");
		hs.add("C");
		System.out.println(hs);
		
	}
}
