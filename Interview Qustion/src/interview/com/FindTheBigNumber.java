package interview.com;

import java.util.Arrays;

public class FindTheBigNumber {
	public static void main(String[] args) {
		
				
		int arr[]= {8,5,6,7,5,2,0,4,1,9,8,9};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		  }
			System.out.println(Arrays.toString(arr));
			String result = " ";
			
			for (int i = 0; i < arr.length; i++) {
				result=result+arr[i];
			}
			System.out.println(result);
		}
	}
