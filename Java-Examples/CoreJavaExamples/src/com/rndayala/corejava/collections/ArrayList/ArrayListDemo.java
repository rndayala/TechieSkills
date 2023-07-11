package com.rndayala.corejava.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Using ArrayList and it's methods
 * @author rndayala
 *
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		// Creating an ArrayList
		ArrayList<String> fruits = new ArrayList<>();
		
		// Adding elements to an ArrayList
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		
		System.out.println("Fruits List : " + fruits);

		// Accessing elements
		String firstFruit = fruits.get(0);
		System.out.println(firstFruit); // Output: Apple

		// Modifying elements
		fruits.set(1, "Grapes");
		System.out.println(fruits); // Output: [Apple, Grapes, Orange]

		// Removing elements
		fruits.remove(2); // Remove element at index 2
		System.out.println(fruits); // Output: [Apple, Grapes]

		// Check size of ArrayList
		int size = fruits.size();
		System.out.println(size); // Output: 2

		// Iterating over ArrayList using for-each loop
		for (String fruit : fruits) {
		    System.out.println(fruit);
		}
		
		// checking if ArrayList contains an element
		boolean containsBanana = fruits.contains("Banana");
		System.out.println(containsBanana); // Output: false
		
		// checking if ArrayList is empty
		boolean isEmpty = fruits.isEmpty();
		System.out.println(isEmpty); // Output: false

		// Sorting ArrayList
		Collections.sort(fruits);
		System.out.println(fruits); // Output: [Apple, Grapes]

	}

}
