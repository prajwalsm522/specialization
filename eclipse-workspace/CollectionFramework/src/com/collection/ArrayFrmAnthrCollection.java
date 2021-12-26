package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayFrmAnthrCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> firstfiveprimes = new ArrayList<Integer>();
		firstfiveprimes.add(2);
		firstfiveprimes.add(3);
		firstfiveprimes.add(5);
		firstfiveprimes.add(7);
		firstfiveprimes.add(11);
		
		List<Integer> firsttenprimes = new ArrayList<Integer>(firstfiveprimes); //collection constructer
		
		List<Integer> nextfiveprimes = new ArrayList<Integer>();
		nextfiveprimes.add(13);
		nextfiveprimes.add(17);
		nextfiveprimes.add(19);
		nextfiveprimes.add(23);
		nextfiveprimes.add(29);
		
		//Adding an entire collection to array list
		firsttenprimes.addAll(nextfiveprimes);
		
		System.out.println(firsttenprimes); //prints all the primes
		
		System.out.println(firsttenprimes.isEmpty()); //check if the list is empty
		System.out.println(firsttenprimes.size()); //size of the list
		
		System.out.println(firsttenprimes.get(0)); //first prime
		System.out.println(firsttenprimes.get(1)); //secound prime
		System.out.println(firsttenprimes.get(firsttenprimes.size()-1)); //last prime usimg get(size()-1);
		System.out.println(firsttenprimes.indexOf(23)); //find the index of element
		firsttenprimes.remove(5);  //to remove element index**
		
	}

}
