package com.collection;

import java.util.LinkedList;

public class Linkedlistdemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		
		list.addLast("C");
		list.addFirst("D");
		
		list.add(2,"E");

		list.add("f");
		list.add("H");
		
		System.out.println(list);
		
		list.remove("f");
		list.remove(1);
		list.removeLast();
		System.out.println(list);
		
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("z");
		list2.add("k");
		
		list.addAll(list2);
		System.out.println(list);
		
		list2.getFirst();
		list2.getLast();
		list2.get(1);
	}

}
