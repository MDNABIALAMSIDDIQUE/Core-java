package collection.com;

import java.util.Collection;
import java.util.LinkedHashMap;

public class LinkedHasMap {
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		LinkedHashMap linkedHashMap= new LinkedHashMap<>();
		
		linkedHashMap.put("Oracle",4000);
		linkedHashMap.put("null", null);
		linkedHashMap.put("Null", null);
		linkedHashMap.put("python", 5000);
		linkedHashMap.put("Ruby", 1000);
		linkedHashMap.put("JAVA", 1000);
		linkedHashMap.put("CPP", 2000);
		linkedHashMap.put("C",3000);
		
		System.out.println("Current data"+linkedHashMap);
		
		Collection valCollection=linkedHashMap.values();
		System.out.println("InterNal values"+valCollection);
		
		
		
	}

}
