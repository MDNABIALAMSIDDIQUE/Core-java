package interview.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountAplhawet {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Any String...\n");
		
		String string=scanner.nextLine().toUpperCase();
										// remove the toUpperCase Small or Big  Total Count
		// string = "MD NABI ALAM";
		char ch;
		Map<Character, Integer> map=new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			ch=string.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				
			}else {
				map.put(ch, 1);
			}
		}
		
		System.out.print(map);
	}

}
