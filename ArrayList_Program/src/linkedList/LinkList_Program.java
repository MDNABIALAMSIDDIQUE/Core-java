package linkedList;
import java.util.*;
public class LinkList_Program {
	public static void main(String[] args) {
	
		LinkedList linkedList= new LinkedList();
		linkedList.add("MD NABI ALAM");
		linkedList.add("BCA");
		linkedList.add("PATNA");
		
		System.out.println("Your Date Addes Succes"+linkedList);
		linkedList.remove(1);
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println("All Date Remove so Sorry"+linkedList);
		
		
	}

}
