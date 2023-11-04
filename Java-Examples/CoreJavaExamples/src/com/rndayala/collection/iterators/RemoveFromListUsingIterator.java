package com.rndayala.collection.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveFromListUsingIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");

		System.out.println(list);

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);

			// using list remove() method will throw
			// java.util.ConcurrentModificationException
			// list.remove(1);

			// Safe removal using the iterator's remove method
			iterator.remove();
		}
		System.out.println("List after removal: " + list);
	}
}
