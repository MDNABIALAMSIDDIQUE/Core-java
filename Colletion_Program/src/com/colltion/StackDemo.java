package com.colltion;

import java.util.Stack;

public class StackDemo {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack stack= new Stack();
		System.out.println(stack.capacity());
		stack.push("Oracle");
		stack.push("MAths");
		stack.push(4525);
		stack.push(45.25);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.peek();
		
		System.out.println(stack);
		
		
	}

}
