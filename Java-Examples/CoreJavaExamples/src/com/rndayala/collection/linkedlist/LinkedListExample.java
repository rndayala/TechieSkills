package com.rndayala.collection.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// LinkedList is a doubly-linked list implementation of the List and Deque interfaces. 
// It implements all optional list operations, so we can use like ArrayList.
// Additionally, it also has queue like operations, addFirst(), addLast(), removeFirst(), removeLast(), etc.
public class LinkedListExample {

	public static void main(String[] args) {

		// 1. we can add homogeneous elements
		// this is where, generics syntax help
		// insertions are by default to the end of the list.
		// LinkedList<int> list1 = new LinkedList<int>(); // ERROR : primitive types not
		// allowed
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(10);
		list1.add(10); // duplicates are allowed
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(null); // null values insertion is allowed
		list1.add(null);
		System.out.println(list1); // [10, 10, 20, 30, 40, null, null]

		// searching inside LinkedList
		// uses equals(o, e) method
		boolean isPresent = list1.contains(null);
		System.out.println(isPresent);
		
		System.out.println(list1.contains(20));

		// finding last occurrence position of element
		// uses equals() method, if element not found, returns -1
		int pos = list1.lastIndexOf(null);
		System.out.println(pos);

		// finding first occurrence position of element
		// if not found, returns -1
		pos = list1.indexOf(null);
		System.out.println(pos);

		// 2. we can add heterogeneous elements
		LinkedList list2 = new LinkedList();
		list2.add(10);
		list2.add('J');
		list2.add("Java");
		list2.add(44.5);
		System.out.println(list2); // [10, J, Java, 44.5]

		// 3. We can create list from another Collection - addAll(Collection c) method
		// and then we can also add additional elements
		LinkedList list3 = new LinkedList();
		list3.addAll(list2);
		list3.add("list2 + this message");
		System.out.println(list3); // [10, J, Java, 44.5, list2 + this message]

		// 4. index based insertion is allowed
		list3.add(2, "Spring Boot"); // index based insertion is allowed
		System.out.println(list3); // [10, J, Spring Boot, Java, 44.5, list2 + this message]
		
		// 4.1 add element to the first of the list using addFirst() method
		list3.addFirst(1);
		System.out.println(list3); // [1, 10, J, Spring Boot, Java, 44.5, list2 + this message]
		
		// 4.2 add element to the last of the list using addLast() method
		list3.addLast("20");
		System.out.println(list3); // [1, 10, J, Spring Boot, Java, 44.5, list2 + this message, 20]

		// 5. index based access or retrieve of elements is allowed
		System.out.println(list3.get(2)); // Spring Boot
		// System.out.println(list3[2]); // ERROR : this type of index access is only
		// allowed for arrays

		// 6. Adding multiple types of elements to the list, but using this way
		// compromises type safety.
		// Create LinkedList with Object as element type
		LinkedList<Object> multiTypeList = new LinkedList<>();
		multiTypeList.add(Integer.valueOf(10));
		multiTypeList.add(Double.valueOf(11.5));
		multiTypeList.add("String Data");
		multiTypeList.add(Arrays.asList(1, 2, 3));

		// accessing multiple types of elements from the list
		// instanceof pattern matching, which is a feature from JDK 16.
		// for this code to work, we have to use JDK16.
//				for (Object dataObj: multiTypeList) {
//				    if (dataObj instanceof Integer intData)
//				        System.out.println("Integer Data : " + intData);
//				    else if (dataObj instanceof Double doubleData)
//				        System.out.println("Double Data : " + doubleData);
//				    else if (dataObj instanceof String stringData)
//				        System.out.println("String Data : " + stringData);
//				    else if (dataObj instanceof List < ? > intList)
//				        System.out.println("List Data : " + intList);
//				}

		// 7. array to LinkedList -
		// https://www.baeldung.com/java-primitive-array-to-list
		// Problems :
		// int[] numbers = new int[] {10, 20, 30, 40, 50};
		// List list4 = Arrays.asList(numbers); // Problem : Autoboxing only happens for
		// a single element
		// There is no automatic conversion from an array of primitive types to an array
		// of their boxed reference types
		// Alternative solution : iterate over the array and add to list
		int[] numbers = new int[] { 10, 20, 30, 40, 50 };
		List<Integer> output = new LinkedList<Integer>();
		for (int value : numbers) {
			output.add(value);
		}
		System.out.println(output);

		// 7.a create an array of boxed primitives
		Integer[] input = new Integer[] { 10, 20, 30, 40, 50 };
		List list4 = Arrays.asList(input); // returns fixed sized list backed by array

		list4.set(2, 60); // changing list, also changes array
		System.out.println(list4); // [10, 20, 60, 40, 50]
		// array also gets changed
		for (int n : input) {
			System.out.print(n + " "); // 10 20 60 40 50
		}
		System.out.println();

		// 8. list size
		System.out.println(list4.size()); // 5

		// 9. checking if list is empty or not
		boolean isEmptyFlag = list4.isEmpty();
		System.out.println(isEmptyFlag); // false

		// 10. removing elements from LinkedList
		LinkedList list5 = new LinkedList();
		list5.add("Java");
		list5.add("C");
		list5.add("Scala");
		list5.add("Python");

		System.out.println(list5); // [Java, C, Scala, Python]

		// remove(int index) -- returns the element previously at the index
		System.out.println(list5.remove(2)); // Scala
		System.out.println(list5); // [Java, C, Python]

		// remove(Object o) -- returns true if the element exists in the list
		// returns false if element does not exist
		System.out.println(list5.remove("C")); // true
		System.out.println(list5); // [Java, Python]

		System.out.println(list1.remove(null)); // true
		System.out.println(list1); // [10, 10, 20, 30, 40, null]
		
		// LinkedList specific functions
		LinkedList list6 = new LinkedList();
		list6.add(10);
		list6.add('J');
		list6.add(10);
		list6.add("Java");
		list6.add(23.5);
		list6.add(false);
		
		System.out.println(list6); // [10, J, 10, Java, 23.5, false]
		
		// getFirst() -- returns the first element in the list
		// these behavior come from Deque interface of LinkedList
		System.out.println(list6.getFirst());  // 10
		
		// getLast() -- returns the last element in the list
		System.out.println(list6.getLast());  // false
		
		
		System.out.println(list6.remove());
		// System.out.println(list6.removeFirst());
		System.out.println(list6);
		
		System.out.println(list6.element());
		System.out.println(list6);
		
		// 
		
//		remove(int index): Object
//		removes the element at the specified position in the list.
		
//		remove(Object o): boolean 
//		removes the first occurrence of the specified element from the list.
		
//		removeAll(Collection c): boolean 
//		removes all of the elements specified in the list from the original list.
//
//		The above 3 functions are from List interface. Below functions are not in ArrayList.
		
//		removeFirst(): Object 
//		removes the first element from the list. 
		
//		remove(): Object 
//		retrieves and removes the head (first element) in the list. This method internally uses removeFirst().
//
//		    public E remove() {
//		        return removeFirst();
//		    }
		
//		removeFirstOccurrence(Object o): boolean 
//		removes the first occurrence of the specified element from the list. This is the same as the remove(Object) method.
//
//		    public boolean removeFirstOccurrence(Object o) {
//		        return remove(o);
//		    }
		
//		removeLast(): Object
//		Removes and returns the last element from this list.
		
//		removeLastOccurrence(Object o): boolean
//		Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).

//  	********************************************************
		
//		Queue operations in LinkedList :
		
//		peek() 
//		Retrieves, but does not remove, the head (first element) of this list.
		
//		peekFirst()
//		Retrieves, but does not remove, the first element of this list. Like getFirst()
		
//		peekLast()
//		Retrieves, but does not remove, the last element of this list. Like getLast()
		
//		poll()
//		Retrieves and removes the head (first element) of this list.
		
//		pollFirst()
//		Retrieves and removes the first element of this list.
		
//		pollLast()
//		Retrieves and removes the last element of this list.
		
//		push(E e)
//		Same like addFirst(). inserts the element at the front of this list.
		
//		pop(): E
//		Same like removeFirst(). removes and returns the first element of this list.
		
//		offer(E e): boolean
//		Same like add(e), Adds the specified element as the tail (last element) of this list.
		
//		offerFirst(E e): boolean
//		Same like addFirst(e), introduced in 1.6. Inserts the specified element at the front of this list.
		
//		offerLast(E e): boolean
//		Same like addLast(e), introduced in 1.6. Inserts the specified element at the end of this list.

	}

}
