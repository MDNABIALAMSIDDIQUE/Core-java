package march.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
	
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the String..");
	
	String sc=scanner.nextLine();
	char ch;
	 Map<Character, Integer> map= new HashMap<>();
	 for (int i = 0; i < sc.length(); i++) {
		ch=sc.charAt(i);
		if (map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);
			
		} else {
			map.put(ch, 1);
		}
	}
	 System.out.println(map);
}

}
