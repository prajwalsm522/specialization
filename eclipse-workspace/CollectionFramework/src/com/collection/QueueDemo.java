package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new PriorityQueue<>();
		queue.add("India");
		queue.add("Russia");
		queue.add("Germany");
		queue.add("USA");
		
		System.out.println(queue);
		
		queue.remove();
		
		queue.poll();
	}

}
