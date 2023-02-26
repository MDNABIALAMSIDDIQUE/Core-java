package com.ForLoop.Beack;

public class Ex01 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i==j) {
					continue;
					
				}
				System.out.println(i+"           "+j);
			}
		}
			
	}

}
