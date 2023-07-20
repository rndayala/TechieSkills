package com.rndayala.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.security.Signature;

public class SingletonTest {

	public static void main(String[] args) {
		// Singleton s1 = new Singleton(); // ERROR : the constructor is declared private, and not visible.
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton reflSingleton = null; 
		
		// here, both the objects refers to the same instance
		printSingleton("s1", s1);	// Object : s1, hashcode: 366712642
		printSingleton("s2", s2);	// Object : s2, hashcode: 366712642
		
		// Singleton issue with Reflection
		try {
			Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			reflSingleton = constructor.newInstance();
			// here, the object refers to different instance, which is a violation
			printSingleton("reflSingleton", reflSingleton);	// 
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Exception Caught. You can't create a Singleton instance through Reflection.");
		}
		
		// Singleton issue with clone
		Singleton clone;
		try {
			clone = (Singleton) s2.clone();
			printSingleton("s2", s2);	// Object : s2, hashcode: 366712642
			printSingleton("clone", clone);	// Object : clone, hashcode: 1442407170
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		SingletonThreadSafe1 s3 = SingletonThreadSafe1.getInstance();
		SingletonThreadSafe1 s4 = SingletonThreadSafe1.getInstance();
		
		// here, both the objects refers to the same instance
		printSingletonThreadSafe1("s3", s3);	// Object : s3, hashcode: 1028566121
		printSingletonThreadSafe1("s4", s4);	// Object : s4, hashcode: 1028566121
		
	}
	
	static void printSingleton(String name, Singleton obj) {
		System.out.println(String.format("Object : %s, hashcode: %d", name, obj.hashCode()));
	}
	
	static void printSingletonThreadSafe1(String name, SingletonThreadSafe1 obj) {
		System.out.println(String.format("Object : %s, hashcode: %d", name, obj.hashCode()));
	}

}
