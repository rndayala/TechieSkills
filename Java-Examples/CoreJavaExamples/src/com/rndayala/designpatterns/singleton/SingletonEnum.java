package com.rndayala.designpatterns.singleton;

/**
 * In the context of implementing the Singleton pattern using an enum, 
 * the INSTANCE is a single constant instance of the enum type. 
 * In Java, enum constants are implicitly static and final, 
 * which means they can only be created once during the class loading and cannot be modified afterward. 
 * As a result, an enum with a single constant effectively serves as a singleton.
 * 
 * @author rndayala
 *
 */

public enum SingletonEnum {
	// The INSTANCE is the only enum constant available for the SingletonEnum enum. 
	// It represents the sole instance of the SingletonEnum class. 
	INSTANCE;
	
	public void doSomething() {
		// implement functionality here
	}

	public static void main(String[] args) {
		SingletonEnum s1 = SingletonEnum.INSTANCE;
		SingletonEnum s2 = SingletonEnum.INSTANCE;
		
		// check both instances are the same
		System.out.println(s1 == s1); // true
	}

}

// observations :
// As enum constants are inherently thread-safe and guaranteed to be initialized only once, 
// using an enum for the Singleton pattern eliminates the need for explicit synchronization and 
// ensures a simple, efficient, and safe singleton implementation in Java.

