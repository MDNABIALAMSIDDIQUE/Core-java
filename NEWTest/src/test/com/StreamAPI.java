package test.com;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
	
	public static void main(String[] args)
	{
		
		
		List<Integer> number= Arrays.asList(2,8,6,3,4,2,4,9,3);
		//System.out.println(number);
		number.stream().filter(n->n%2==0).forEach(System.out::println);
		
	}

}
