package reverse.string.com;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ReversString_03 {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the String Revers....");
		String string=scanner.nextLine();
		char[] ch=string.toCharArray();
		List<Character> list=new LinkedList<>(); 
		for(char c:ch)
			list.add(c);
		Collections.reverse(list);
		ListIterator li=list.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next());
		}
	}

}
