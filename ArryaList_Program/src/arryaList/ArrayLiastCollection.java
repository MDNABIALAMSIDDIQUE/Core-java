package arryaList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLiastCollection {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		
		System.out.println(list);
		list.add("MD ZOHAN");
		list.add("SUfi Khatoon");
		list.add("MD ZOHAN");
		System.out.println(list);
		
		Iterator<String> iterable = list.iterator();
		while(iterable.hasNext()) {
			System.out.println(iterable.next());		}
	}
}
