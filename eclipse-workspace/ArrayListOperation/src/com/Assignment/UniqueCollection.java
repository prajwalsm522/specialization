package com.Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class UniqueCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] elements = new String[5];
//		
		ArrayList<String> demo = new ArrayList<String>();
//		demo.add("Mysore");
//		demo.add("hyd");
//		demo.add("hospet");
//		Collections.sort(demo);
		
		demo.add("rani");
		demo.add("vivek");
		demo.add("hani");
		Set<String> list2 = new TreeSet<>(list1);
		System.out.println("ArrayList Unique elements");
		for(String str:list2) {
			System.out.println(str);
		}
		
		
	}
}
