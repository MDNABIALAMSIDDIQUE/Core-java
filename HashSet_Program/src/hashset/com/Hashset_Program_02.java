package hashset.com;

import java.util.HashSet;

public class Hashset_Program_02 {
	public static void main(String[] args) {
		
	HashSet<String> hashSet = new HashSet<String>();
	
	System.out.println("===========================================");
	
	hashSet.add("AAA");
	hashSet.add("BBB");
	hashSet.add("CCC");
	hashSet.add("DDD");
	hashSet.add("EEE");
	
	System.out.println(hashSet);
	System.out.println("===========================================");
	
	hashSet.add("");
	hashSet.add("");
	System.out.println("===========================================");
	System.out.println(hashSet);
	
	System.out.println("===========================================");
	hashSet.add(null);
	hashSet.add(null);
	
	System.out.println(hashSet);
	System.out.println("===========================================");
	
	
	
	
	
	}
}
