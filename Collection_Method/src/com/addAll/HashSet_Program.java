package com.addAll;

import java.util.HashSet;

public class HashSet_Program {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		HashSet hashSet= new HashSet();
		
		hashSet.add("CORE JAVA");
		hashSet.add("BBB");
		hashSet.add("CCC");
		hashSet.add("DDD");
		hashSet.add("EEE");
		System.out.println(hashSet);
		
		HashSet hashSet2 = new HashSet();
		
		System.out.println(hashSet2.addAll(hashSet));
		System.out.println(hashSet2);
		
		
		
		
	}

}
