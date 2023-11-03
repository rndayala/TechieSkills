package com.rndayala.collection.arraylist;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CustomObject {
	private String data;
	
	public CustomObject() {
		data = "custom object";
	}
	
	public CustomObject(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Custom object data: " + data;
	}
	
}

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		// 1. we can add homogeneous elements
		// this is where, generics syntax help
		// insertions are by default to the end of the list.
		// ArrayList<int> list1 = new ArrayList<int>(); // ERROR : primitive types not allowed
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(10);  // duplicates are allowed
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(null); // null values insertion is allowed
		list1.add(null);
		System.out.println(list1); // [10, 10, 20, 30, 40, null, null]
		
		// searching inside ArrayList
		// uses equals(o, e) method
		boolean isPresent = list1.contains(null);
		System.out.println(isPresent);
		
		// finding last occurrence position of element
		// uses equals() method, if element not found, returns -1
		int pos = list1.lastIndexOf(null);
		System.out.println(pos);
		
		// finding first occurrence position of element
		// if not found, returns -1
		pos = list1.indexOf(null);
		System.out.println(pos);
		
		// 2. we can add heterogeneous elements
		ArrayList list2 = new ArrayList();
		list2.add(10);
		list2.add('J');
		list2.add("Java");
		list2.add(44.5);
		System.out.println(list2); // [10, J, Java, 44.5]
		
		// 3. We can create list from another Collection - addAll(Collection c) method
		// and then we can also add additional elements
		List list3 = new ArrayList();
		list3.addAll(list2);
		list3.add("list2 + this message");
		System.out.println(list3); // [10, J, Java, 44.5, list2 + this message]
		
		// 4. index based insertion is allowed
		list3.add(2, "Spring Boot"); // index based insertion is allowed, but not recommended
		System.out.println(list3); // [10, J, Spring Boot, Java, 44.5, list2 + this message]
		
		// 5. index based access or retrieve of elements is allowed
		System.out.println(list3.get(2));  // Spring Boot
		// System.out.println(list3[2]); // ERROR : this type of index access is only allowed for arrays
		
		// 6. Adding multiple types of elements to the list, but using this way compromises type safety.
		// Create ArrayList with Object as element type
		ArrayList<Object> multiTypeList = new ArrayList<>();
		multiTypeList.add(Integer.valueOf(10));
		multiTypeList.add(Double.valueOf(11.5));
		multiTypeList.add("String Data");
		multiTypeList.add(Arrays.asList(1, 2, 3));
		multiTypeList.add(new CustomObject("Class Data"));
		multiTypeList.add(BigInteger.valueOf(123456789));
		multiTypeList.add(LocalDate.of(2023, 9, 19));
		
		// accessing multiple types of elements from the list
		// instanceof pattern matching, which is a feature from JDK 16.
		// for this code to work, we have to use JDK16.
//		for (Object dataObj: multiTypeList) {
//		    if (dataObj instanceof Integer intData)
//		        System.out.println("Integer Data : " + intData);
//		    else if (dataObj instanceof Double doubleData)
//		        System.out.println("Double Data : " + doubleData);
//		    else if (dataObj instanceof String stringData)
//		        System.out.println("String Data : " + stringData);
//		    else if (dataObj instanceof List < ? > intList)
//		        System.out.println("List Data : " + intList);
//		    else if (dataObj instanceof CustomObject customObj)
//		        System.out.println("CustomObject Data : " + customObj);
//		    else if (dataObj instanceof BigInteger bigIntData)
//		        System.out.println("BigInteger Data : " + bigIntData);
//		    else if (dataObj instanceof LocalDate localDate)
//		        System.out.println("LocalDate Data : " + localDate.toString());
//		}
		
		// 7. array to arrayList - https://www.baeldung.com/java-primitive-array-to-list
		// Problems : 
		// int[] numbers = new int[] {10, 20, 30, 40, 50};
		// List list4 = Arrays.asList(numbers); // Problem : Autoboxing only happens for a single element
		// There is no automatic conversion from an array of primitive types to an array of their boxed reference types
		// Alternative solution : iterate over the array and add to list
		int[] numbers = new int[] {10, 20, 30, 40, 50};
		List<Integer> output = new ArrayList<Integer>();
		for (int value : numbers) {
		    output.add(value);
		}
		System.out.println(output);
		
		// 7.a create an array of boxed primitives
		Integer[] input = new Integer[] {10, 20, 30, 40, 50};
		List list4 = Arrays.asList(input);  // returns fixed sized list backed by array
		
		list4.set(2, 60);  // changing list, also changes array
		System.out.println(list4);  // [10, 20, 60, 40, 50]
		// array also gets changed
		for (int n:input) {
			System.out.print(n + " ");  // 10 20 60 40 50 
		}
		System.out.println();
		
		// 8. list size
		System.out.println(list4.size());  // 5
		
		// 9. checking if list is empty or not
		boolean isEmptyFlag = list4.isEmpty();
		System.out.println(isEmptyFlag);   // false
		
		// 10. removing elements from arraylist
		List list5 = new ArrayList();
		list5.add("Java");
		list5.add("C");
		list5.add("Scala");
		list5.add("Python");
		
		System.out.println(list5); // [Java, C, Scala, Python]
		
		// remove(int index) -- returns the element previously at the index
		System.out.println(list5.remove(2)); // Scala
		System.out.println(list5);  // [Java, C, Python]
		
		// remove(Object o) -- returns true if the element exists in the list
		// returns false if element does not exist
		System.out.println(list5.remove("C")); // true
		System.out.println(list5);  // [Java, Python]
		
		System.out.println(list1.remove(null)); // true
		System.out.println(list1); // [10, 10, 20, 30, 40, null]
		
		
	}


}
