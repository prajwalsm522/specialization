package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetFrmAnthrCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numberDivBy5 = new ArrayList<Integer>();
		numberDivBy5.add(5);
		numberDivBy5.add(10);
		numberDivBy5.add(15);
		numberDivBy5.add(20);
		numberDivBy5.add(25);
		
		List<Integer> numberDivBy3 = new ArrayList<Integer>();
		numberDivBy3.add(3);
		numberDivBy5.add(6);
		numberDivBy5.add(9);
		numberDivBy5.add(12);
		numberDivBy5.add(15);
		
		Set<Integer> numberDivBy5nd3 = new HashSet<Integer>(numberDivBy5);
		numberDivBy5nd3.addAll(numberDivBy3);
		System.out.println(numberDivBy5nd3);
		
		
	}

}
