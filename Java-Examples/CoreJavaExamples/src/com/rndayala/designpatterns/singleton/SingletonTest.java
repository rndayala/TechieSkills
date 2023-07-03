package com.rndayala.designpatterns.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// Singleton s1 = new Singleton(); // ERROR : the constructor is declared private, and not visible.
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		// here, both the objects refers to the same instance
		printSingleton("s1", s1);	// Object : s1, hashcode: 366712642
		printSingleton("s2", s2);	// Object : s2, hashcode: 366712642
		
		SingletonThreadSafe1 s3 = SingletonThreadSafe1.getInstance();
		SingletonThreadSafe1 s4 = SingletonThreadSafe1.getInstance();
		
		// here, both the objects refers to the same instance
		printSingletonThreadSafe1("s3", s3);	// Object : s3, hashcode: 1442407170
		printSingletonThreadSafe1("s4", s4);	// Object : s4, hashcode: 1442407170
		
	}
	
	static void printSingleton(String name, Singleton obj) {
		System.out.println(String.format("Object : %s, hashcode: %d", name, obj.hashCode()));
	}
	
	static void printSingletonThreadSafe1(String name, SingletonThreadSafe1 obj) {
		System.out.println(String.format("Object : %s, hashcode: %d", name, obj.hashCode()));
	}

}