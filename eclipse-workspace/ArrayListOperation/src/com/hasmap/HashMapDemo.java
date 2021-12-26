package com.hasmap;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Teacher,Subject> list = new HashMap<Teacher,Subject>();
		
		list.put(new Teacher("SAM",1),new Subject(1,"Java"));
		list.put(new Teacher("praju",2),new Subject(2,"Ruby on Rails"));
		list.put(new Teacher("ravi",3),new Subject(3,"Kotlin"));
		list.put(new Teacher("sanvi",4),new Subject(4,"Python"));
		list.put(new Teacher("sanvi",4),new Subject(4,"Python")); //dublicates allowed
		
		for(Entry<Teacher,Subject> entry : list.entrySet()) {
			System.out.println("Key "+entry.getKey()+" "+"value: "+entry.getValue()
		);
		}
	}

}
