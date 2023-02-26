package com.Shorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NumberShortingDec {
	public static void main(String[] args) {
		
		ArrayList<Integer> numberArrayList= new ArrayList<>();
		numberArrayList.add(0);
		numberArrayList.add(5);
		numberArrayList.add(6);
		numberArrayList.add(55);
		numberArrayList.add(536);
		numberArrayList.add(12);
		numberArrayList.add(632);
		numberArrayList.add(28853);
		numberArrayList.add(55885);
		System.out.println(numberArrayList.size());
		System.out.println("Before Shoruting"+numberArrayList);
		
		for (Integer integer : numberArrayList) {
			
			System.out.println("  "+integer);
		}
		System.out.println("=========================================");
		Collections.sort(numberArrayList,Collections.reverseOrder());
		for (Integer integer : numberArrayList) {
			System.out.println("  "+integer);
		}
	}

}
