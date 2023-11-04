package com.rndayala.collection.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AddingToListUsingListIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");

		System.out.println(list); // [One, Two, Three]

		ListIterator<String> iterator = list.listIterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element); // One  Two  Three

			// using list add() method will throw
			// java.util.ConcurrentModificationException
			// list.add("ABCD");
			
			// The listIterator, add() method, which, as the name suggests, 
			// allows us to add an element before the item that would be returned by next() and 
			// after the one returned by previous():
			iterator.add("ABCD");
		}
		
		System.out.println("List after insertions : " + list); // [One, ABCD, Two, ABCD, Three, ABCD]
	}
}
