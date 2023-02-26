package loopArrayList;

import java.util.ArrayList;

public class ArrayLoop {
	public static void main(String[] args)  {
		
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		System.out.println(arrayList);
		
		arrayList.add(1122);
		arrayList.add(1144);
		arrayList.add(6699);
		arrayList.add(12);
		arrayList.add(200);
		arrayList.add(1);
		System.out.println("=============================");
		System.out.println(arrayList);
		System.out.println("=============================");
	/*	
		System.out.println("By Loop");
		for (int i = 0; i < arrayList.size(); i++) {
			
			System.out.println(arrayList.get(i));
		*/	
	/*	
		System.out.println("Adv loop");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		*/
		
		
		System.out.println("While loop");
		int count=0;
		while (	arrayList.size()>count) {
			System.out.println(arrayList.get(count));
			count++;
			
		}
		
		
		}
	}


