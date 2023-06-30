package com.rndayala.designpatterns.singleton;

// Author : Raghunath Dayala

/* Singleton is a design pattern that restricts a class  to have only one instance, 
 * with a global point of access to it.
 * Useful when you want to limit the number of instances of a class that can exist in the system,
 * Ref : Check my Kindle library

 */

public class Singleton {
	private static Singleton instance = null;
	
	// a private constructor that ensures that it cannot be  instantiated directly.
	private Singleton() {
		System.out.println("Creating object..");
	}
	
	// public static method called getInstance is provided, 
	// which returns the  single instance of the class.  The first time the getInstance
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

/* Problems :
 * 1. the above implementation is not thread safe.
 * 2. We can still be able to create new objects using Reflection.
 * 3. We can be able to create new objects using Cloning.
 * 4. When we do serialization/de-serialization, we get new objects.
*/