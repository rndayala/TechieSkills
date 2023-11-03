package com.rndayala.collection.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add(10);
		hs.add(30);
		hs.add(20);
		hs.add(10);

		// insertion order is not preserved
		// duplicates are not allowed
		System.out.println(hs); // [20, 10, 30]

		// null values are allowed
		hs.add(null);
		hs.add(null);
		System.out.println(hs); // [null, 20, 10, 30]

		// Convert the set to an array to get elements
		Integer[] arr = new Integer[hs.size()];
		hs.toArray(arr);
		// Find the first and last elements of the array
		Integer first = arr[0];
		Integer last = arr[arr.length - 1];
		System.out.println("First element: " + first);
		System.out.println("Last element: " + last);

		// **********************************************************
		// LinkedHashSet maintains the insertion order
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add(30);
		lhs.add(20);
		lhs.add(10);

		// insertion order is preserved
		System.out.println(lhs); // [10, 30, 20]

	}

}
