package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeset = new TreeSet<>();
		
		treeset.add("B");
		treeset.add("c");
		treeset.add("D");
		treeset.add("B");
		treeset.add("b");
		
		System.out.println(treeset);  //treeset sorts
		
		String check = treeset.ceiling("B");
		String ck = treeset.ceiling("z");
		
		System.out.println(check);
		System.out.println(ck);
		
		treeset.comparator();
		
		System.out.println(treeset.comparator());
		
		System.out.println(treeset.pollFirst());
		System.out.println(treeset.pollLast());

	}

}
