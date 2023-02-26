package com.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("JAVA");
		arrayList.add("SpringBoot");
		arrayList.add("Spring");
		arrayList.add("Oracle");
		
		Iterator<String> iterator=arrayList.iterator();
		while (iterator.hasNext()) {
			String next=iterator.next();
			System.out.println(next);
			System.out.println(next.length());
			System.out.println(next.hashCode());
		}
	}
}
