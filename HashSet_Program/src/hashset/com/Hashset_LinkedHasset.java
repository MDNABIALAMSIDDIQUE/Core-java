package hashset.com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset_LinkedHasset {
	
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		System.out.println(hashSet);
		hashSet.add("MD NABI ALAM");
		hashSet.add("NEHAL ALAM");
		hashSet.add("NADEEM ALAM");
		hashSet.add("ZOHAN HASSAN");
		hashSet.add("DARBHANGA");
		hashSet.add("GAYA");
		hashSet.add("BHINDASPUR");
		
		System.out.println(hashSet);
		System.out.println("===================================================");
		LinkedHashSet<String> hashSet2 = new LinkedHashSet<>();
		hashSet2.add("MD NABI ALAM");
		hashSet2.add("NEHAL ALAM");
		hashSet2.add("NADEEM ALAM");
		hashSet2.add("ZOHAN HASSAN");
		hashSet2.add("DARBHANGA");
		hashSet2.add("GAYA");
		hashSet2.add("BHINDASPUR");
		
		System.out.println(hashSet2);
	}
}
