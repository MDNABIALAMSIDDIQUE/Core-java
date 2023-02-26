package hashset.com;

import java.util.HashSet;

public class Hashset_Program {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		System.out.println(hashSet);
		
		hashSet.add("AA");
		hashSet.add("BB");
		hashSet.add("CC");
		hashSet.add("DD");
		hashSet.add("EE");
		
		System.out.println(hashSet);
		HashSet<String> hashSet2 = new HashSet<String>(hashSet);
		System.out.println(hashSet2);
				
	}
}
