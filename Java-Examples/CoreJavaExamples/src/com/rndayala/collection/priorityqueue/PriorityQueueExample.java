package com.rndayala.collection.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		
		// insertion order is not preserved
		// priority queue ==> Highest priority element readily available at the front of the collection
		System.out.println(pq); // [25, 50, 125, 100, 75, 150, 175]
		
		// we can get high priority item by calling peek() method
		System.out.println(pq.peek()); // 25
		
		// to remove the item at the head of the queue, use poll() method.
		System.out.println(pq.poll()); // 25
		
		System.out.println(pq);  // [50, 75, 125, 100, 175, 150]
		
		// duplicate elements are allowed
		pq.add(175);
		System.out.println(pq); // [50, 75, 125, 100, 175, 150, 175]
		
		// nulls are not allowed.
		// it gives NullPointerException
//		pq.add(null);
//		pq.add(null);
//		
//		System.out.println(pq);
		
		
	}

}
