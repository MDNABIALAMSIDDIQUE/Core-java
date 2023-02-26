package com.colltion;

import java.util.LinkedList;

public class LinkedListDemo {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList linkedList= new LinkedList();
		
		
		linkedList.add("JAVA");
		linkedList.add("JAVA");
		System.out.println(linkedList);
		
		linkedList.add("HTML");
		linkedList.add("CSS");
		linkedList.add(null);
		linkedList.add(4455);
		System.out.println(linkedList);
		linkedList.remove(1);
		System.out.println(linkedList);
		linkedList.removeLast();
		System.out.println(linkedList);
		linkedList.removeFirst();
		System.out.println(linkedList);
	}

}
