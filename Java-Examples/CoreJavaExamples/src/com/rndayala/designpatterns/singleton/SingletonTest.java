package com.rndayala.designpatterns.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// Singleton s1 = new Singleton(); // ERROR : the constructor is not visible, since it is declared as private.
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		// here, both the objects refers to the same instance
		print("s1", s1);	// Object : s1, hashcode: 366712642
		print("s2", s2);	// Object : s2, hashcode: 366712642
		
	}
	
	static void print(String name, Singleton obj) {
		System.out.println(String.format("Object : %s, hashcode: %d", name, obj.hashCode()));
	}

}
