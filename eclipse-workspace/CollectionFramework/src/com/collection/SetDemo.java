package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("A");
		hashSet.add("B");
		boolean r1 = hashSet.add("C");
		System.out.println(r1);                 //hashset.add()-> boolean , returns boolean
		boolean r2 = hashSet.add("C");
		System.out.print(r2);
		
	}

}
