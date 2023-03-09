package stem.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumberBYListStremAPI {
	
	public static void main(String[] args) {
		List<Integer> numIntegers=Arrays.asList(445,223,55,66,9,44);
		List<Integer> oddNumber=numIntegers.stream().filter(a ->a %2 !=0)
				.collect(Collectors.toList());
		System.out.println(oddNumber);
		
		
	}

}
