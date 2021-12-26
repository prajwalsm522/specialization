package com.collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = new ArrayList<Integer>(5);
		
		for(int i = 1; i < 5; i++ )
			arrayList.add(i);
		
		System.out.println(arrayList);
		
		arrayList.remove(2);
		arrayList.toArray();
		
		System.out.println(arrayList);
		
//		for(int i = 0; i < arrayList.size(); i++)   //using for loop
//			System.out.println(arrayList.get(i));
		
		for(int i: arrayList) {    //using enhanced for loop
			System.out.print(i);
		}
		
		
	}

}
