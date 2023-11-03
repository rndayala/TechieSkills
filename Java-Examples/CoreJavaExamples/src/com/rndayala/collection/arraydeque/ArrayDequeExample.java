package com.rndayala.collection.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		Deque q = new ArrayDeque();
		q.add("java");
		q.add(1);
//		q.add(null);
//		q.add(null);
		q.add(2);
		q.add(1);

		// insertion order is preserved
		// duplicate elements are allowed
		System.out.println(q);
		
		// nulls are not allowed. Error : NullPointerException
//		q.add(null);
//		System.out.println(q);

		// Creating an ArrayDeque
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();

		// Adding elements to the rear (tail)
		arrayDeque.add("One");
		arrayDeque.add("Two");
		arrayDeque.add("Three");

		// Adding elements to the front (head)
		arrayDeque.addFirst("Zero");

		// Adding elements to the last
		arrayDeque.addLast("Four");
		
		System.out.println(arrayDeque);

		// Removing elements from the rear (tail)
		String removedElement = arrayDeque.removeLast();
		System.out.println("Removed Last Element: " + removedElement);

		// Removing elements from the front (head)
		String removedFirstElement = arrayDeque.removeFirst();
		System.out.println("Removed First Element: " + removedFirstElement);

		// Iterating through the elements
		for (String element : arrayDeque) {
			System.out.println(element);
		}

	}

}
