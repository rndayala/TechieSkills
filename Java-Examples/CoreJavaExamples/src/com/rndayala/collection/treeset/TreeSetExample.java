package com.rndayala.collection.treeset;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(50);
		set.add(100);
		set.add(150);
		set.add(25);
		set.add(75);
		set.add(125);
		set.add(175);
		
		// insertion order is not preserved. 
		// Elements will be stored in sorting order.
		System.out.println(set); // [25, 50, 75, 100, 125, 150, 175]
		
		// duplicates are not allowed
		set.add(175);
		System.out.println(set); // [25, 50, 75, 100, 125, 150, 175]
		
		// nulls are prohibited. NullPointerException
//		set.add(null);
//		System.out.println(set);
		
		// ceiling() and higher() functions
		System.out.println(set.ceiling(140));  // 150
		System.out.println(set.higher(140));   // 150
		
		System.out.println(set.ceiling(150));  // 150
		System.out.println(set.higher(150));   // 175
		
		// returns subset which is between from element, to element(excluded)
		System.out.println(set.subSet(20,  100));  // [25, 50, 75]
		
		// returns set of elements from the specified element
		System.out.println(set.tailSet(90));  // [100, 125, 150, 175]
		
	}

}
