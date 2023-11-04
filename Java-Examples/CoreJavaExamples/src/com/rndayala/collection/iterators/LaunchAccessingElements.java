package com.rndayala.collection.iterators;

import java.util.ArrayList;

public class LaunchAccessingElements {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// we are just printing here, we are not accessing data
		System.out.println(list);
		
		// accessing data
		int val = (int)list.get(2);
		System.out.println(val);
		
		System.out.println("******************************");
		// accessing data for all elements
		for (int i = 0; i < list.size(); i++ ) {
			System.out.println(list.get(i));
		}
		
		System.out.println("******************************");
		// accessing data for all elements using for-each loop
		for(Object obj: list) {
			System.out.println(obj);
		}
	}

}
