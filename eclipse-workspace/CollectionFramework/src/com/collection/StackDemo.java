package com.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		
		stack.push("America");
		stack.push("India");
		stack.push("Germany");
		stack.push("Russia");
		 
	String popelement = stack.pop();  //pop() removes the last/ top most element
	
	System.out.println(popelement);  
	
	System.out.println(stack);  //after pop
	
	String peeked = stack.peek();
	System.out.println(peeked);
	
		
		
	}

}
