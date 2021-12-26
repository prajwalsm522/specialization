package com.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo2 {

	public static void main(String[] args) {
		
		Queue<String> Qlist = new LinkedList<>();
		
		Qlist.add("Praju");
		Qlist.add("sam");
		Qlist.add("Noob");
		Qlist.add("Paul Walker");
		Qlist.add("Humilton");
		Qlist.add("Anthony Rakonin");
		Qlist.add("Force 1 india");
		
		System.out.println(Qlist);
		
		String rmv = Qlist.remove();   //if empty gives noSuchElement Exception
		System.out.println(rmv);
		
		String poll = Qlist.poll();  
		System.out.println(poll);
		
		String pl = Qlist.peek();
		System.out.println(pl);
		
		System.out.println(Qlist.element()); //empty -> nosuchelement exception
		
	}

}
