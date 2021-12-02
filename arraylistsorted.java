package com.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylistsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arraylist = new ArrayList<String>();
		arraylist.add("A");
		arraylist.add("C");
		arraylist.add("Z");
		arraylist.add("B");
		
		System.out.println(arraylist);
		
		Collections.sort(arraylist);
		System.out.println(arraylist);

	}

}
