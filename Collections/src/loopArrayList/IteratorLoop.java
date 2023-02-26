package loopArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLoop {
	
	public static void main(String[] args) {
		ArrayList<String> arrayList= new ArrayList<String>();
		System.out.println(arrayList);
		
		arrayList.add("MD");
		arrayList.add("NABI");
		arrayList.add("ALAM");
		arrayList.add("Gaya");
		
		System.out.println(arrayList);
		
		//Iterator loop
		System.out.println("Iterator loop");
		@SuppressWarnings("rawtypes")
		Iterator iterator=arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
	}

}
