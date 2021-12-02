package com.Assignment;

import java.util.ArrayList;
import java.util.List;

public class ListManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		list1.add("Prajwal");
		list1.add("Nabha");
		list1.add("Amith");
		list1.add("thakrey");
		list1.add("ravi");
		list1.add("rahul");
		list1.add("mycat");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("thakrey");
		list2.add("mycat");
		
		list1.removeAll(list2);   //removesall elements specified from the collection
		System.out.print(list1);
	}

}
