package com.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numberList = new ArrayList<>();
		
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		
//		
//		List<Integer> sqr = new ArrayList<>();
//		for(Integer s: numberList) {
//			sqr.add(s*s);
//		}
//		System.out.println(sqr);
//		
//		
//		List<Integer> sqrlist = numberList.stream().map(s->s*s).collect(Collectors.toList());
//		System.out.println(sqrlist);
//		
//		
//		Set<Integer> sqrset = new HashSet<>();   //classical approoch
//		for(Integer i : numberList) {
//			sqrset.add(i*i);                
//		}
//		
//		System.out.println("sqrlsit using set "+" "+ sqrset); 
//		
//		Set<Integer> squareSet = numberList.stream().map(x->x*x).collect(Collectors.toSet());
//		System.out.println(squareSet);
		
		List<String> languages = new ArrayList<>();
		languages.add("scala");
		languages.add("java");
		languages.add("python");
		languages.add("ruby");
		
		
//		List<String> filterresult = new ArrayList<>();
//		for(String s: languages) {
//			if(s.startsWith("p"))
//				filterresult.add(s);
//		}
		
//		List<String> filterresult = languages.stream().filter(s -> s.startsWith("p")).collect(Collectors.toList());
//		System.out.println(filterresult);
		
		List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		System.out.println("Printing elements one by one using forEach");
		languages.stream().forEach(s -> System.out.println(" "+ s));		//only printing logic
		
		//what is you want to write multiple logic 
		System.out.println();
		languages.stream().sorted().forEach(s -> {
			if(s.equalsIgnoreCase("python"))
				System.out.println("Elements found" + s);
		});
	}

}
