package com.streams;

import java.util.ArrayList;
import java.util.List;

public class ReduceFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		
		int sum = numbers.stream().reduce(0, (ans,i) -> ans+i);
		System.out.println(sum);

	}

}
