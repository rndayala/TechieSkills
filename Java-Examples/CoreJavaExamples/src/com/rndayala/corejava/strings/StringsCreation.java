package com.rndayala.corejava.strings;

// Author : Raghunath Dayala
// In this code, we explore different ways to create String

public class StringsCreation {

	public static void main(String[] args) {
		// A String is an object of class : java.lang.String
		
		String s = new String(); // this creates empty string, prints nothing
		System.out.println("Empty string : " + s); // Empty string : 
		
		// Creating string using constructor
		String s1 = new String("Hello");
		System.out.println("String Data 1 : " + s1); // String Data : Hello
		
		// Creating String from character array
		char[] chArray = {'h', 'e', 'l', 'l', 'o'};
		String s2 = new String(chArray);
		System.out.println("String Data 2 : " + s2); // String Data 2 : hello
		
		// Creating String using string literal - Recommended
		String str = "hello";
		System.out.println("String Data 3 : " + str); // String Data 3 : hello
		
		// Creating String using StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append(", ");
		sb.append("World!");
		String str2 = sb.toString();
		System.out.println("String Data 4 : " + str2); // String Data 4 : Hello, World!
		
		// Creating String using format specifier
		String str3 = String.format("Hello, %s!", "World");
		System.out.println("String Data 5 : " + str3); // String Data 5 : Hello, World!
		
	}

}
