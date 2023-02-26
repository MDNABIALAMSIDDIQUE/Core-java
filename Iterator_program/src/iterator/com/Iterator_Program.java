package iterator.com;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Program {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("A");
		arrayList.add("BB");
		arrayList.add("CC");
		arrayList.add("CC");
		
		System.out.println(arrayList);
		
		Iterator iterator=arrayList.iterator();
		
		while(iterator.hasNext()) {
			String el = (String)iterator.next();
			System.out.println(el);
			
			if(el.equals("CC"))
			{
				iterator.remove();
			}
			
		}
		System.out.println(iterator);
	}
}
