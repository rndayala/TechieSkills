package com.rndayala.collection.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchIterator {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("***************************");
		
		// ListIterator example
		
		List<String> items = new ArrayList<String>();
		items.add("apples");
		items.add("banana");
		items.add("oranges");
		items.add("REPLACE ME");
		items.add("grapes");
		
		ListIterator<String> listIterator = items.listIterator();
		while(listIterator.hasNext()) {
		    String nextWithIndex = items.get(listIterator.nextIndex());		
		    String next = listIterator.next();
		    if("REPLACE ME".equals(next)) {
		        listIterator.set("REPLACED");
		    }
		}		
		listIterator.add("NEW");
		System.out.println(items);
		
		System.out.println("************************");
		
		while(listIterator.hasPrevious()) {
		    String previousWithIndex
		     = items.get(listIterator.previousIndex());
		    String previous = listIterator.previous();
		    System.out.println(previous);
		}
		
		System.out.println("****************************");
		// Traversing elements in reverse order for collection classes that are not List based
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("C");
		hs.add("C++");
		hs.add("Java");
		hs.add("Python");
		hs.add("Spring Boot");
		
		System.out.println(hs);
		
		// Converting LinkedHashSet to ArrayList
		List l = new ArrayList();
		l.addAll(hs);
		
		ListIterator itr2 = l.listIterator(l.size());
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		
	}
}
