package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> numbermaping = new HashMap<>();
		
		numbermaping.put("one", 1);
		numbermaping.put("Two", 2);
		numbermaping.put("Three", 3);
		numbermaping.put("Four", 4);
		
		System.out.println(numbermaping);
		
		numbermaping.putIfAbsent("Four", 4);
		numbermaping.putIfAbsent("Five",5);
		System.out.println(numbermaping);

		
//		Set<String> keys = numbermaping.keySet();  //method1
//		
//		for(String key : keys) {
//			Integer value = numbermaping.get(key);
//			System.out.println("Key: "+""+key+" value: "+""+value);
//		}
//		
//		Set<Entry<String, Integer>> entries = numbermaping.entrySet();  //method 2
//		
//		for(Map.Entry<String, Integer> entry : entries) {
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//			System.out.println(key+" "+value);
//		}
		
		for(Entry<String, Integer> entries : numbermaping.entrySet()) {  //method 3
			System.out.println(entries.getKey()+" "+entries.getValue());
		}
		
		System.out.println(numbermaping.containsValue(5));  //boolean contains**
		
		System.out.println(numbermaping.equals(numbermaping));  // check two maps equals mapings are same;

	    Map<String, Integer> test = new HashMap<>();
		
		test.put("one", 6);
		test.put("Two", 2);
		test.put("Three", 3);
		test.put("Four", 5);
		
		System.out.println(numbermaping.equals(test));  //maping is different so .equals returns false
		
		Set<String> keyzz = test.keySet();
		Collection<Integer> valuezz = test.values();
		Set<Entry<String, Integer>> entrzz = test.entrySet();
		System.out.println(keyzz);
		System.out.println(valuezz);
		System.out.println(entrzz);
		
	}

}
