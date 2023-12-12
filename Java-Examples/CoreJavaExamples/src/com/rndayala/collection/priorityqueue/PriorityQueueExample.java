package com.rndayala.collection.priorityqueue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.Consumer;

public class PriorityQueueExample {

	static Integer sum = 0;
	
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
		
		// to use a value in anonymous classes/lambda expressions, across each iteration 
		// it must be instance/static class level variable
		List<Integer> nums =  Arrays.asList(4, 6, 1, 2, 3, 8, 7);
		nums.forEach(i -> {
			if (i%2 == 0) {
				sum = sum + (i*2);
			}
		});
		
		System.out.println("Sum : " + sum);
		
		// Using streams
		int sum_nums = nums.stream().filter(i-> i%2==0).map(i-> i*2).reduce(0,  (c, e) -> c+e);
		System.out.println(sum_nums);
	}
}
