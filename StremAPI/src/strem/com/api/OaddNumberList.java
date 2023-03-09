package strem.com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OaddNumberList {
	public static void main(String[] args) {
		
		List<Integer> numver= Arrays.asList(11,33,55,66,44,33,99,101,999);
		List<Integer> oddNum= numver.stream().filter(q -> q % 2!= 0)
				.collect(Collectors.toList());
		System.out.println(oddNum);
	}

}
