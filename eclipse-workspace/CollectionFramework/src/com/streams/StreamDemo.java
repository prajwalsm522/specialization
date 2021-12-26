package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numberList = new ArrayList<>();
		
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		
		
		List<Integer> sqr = new ArrayList<>();
		for(Integer s: numberList) {
			sqr.add(s*s);
		}
		System.out.println(sqr);
		
		
		List<Integer> sqrlist = numberList.stream().map(s->s*s).collect(Collectors.toList());
		System.out.println(sqrlist);
		
	}

}
