package com.colltion;

import java.util.ArrayList;

public class AaryList {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("rawtypes")
			ArrayList aList= new ArrayList();
			System.out.println(aList.size());
			System.out.println(aList);
			aList.add("MD NABI ALAM");
			aList.add("Nehal");
			aList.add("Nadeem");
			aList.add("MD NABI ALAM");
			aList.add("Zohan");
			aList.add("Zuraj");
			System.out.println(aList.size());
			System.out.println(aList);
			aList.remove(1);
			System.out.println(aList);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
