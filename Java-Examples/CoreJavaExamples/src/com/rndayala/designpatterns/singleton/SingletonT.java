package com.rndayala.designpatterns.singleton;

/**
 * Singleton in multi-threaded environments.
 * the behavior of Singleton instance when two threads are 
 * getting executed by comparing their hash code values.
 * 
 * The following code works only in Java 8.
 * @author rndayala
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonT {
	
	// declare variable as volatile so that all threads see same state of variable
	// volatile - is used to avoid half-initialized state being returned.
	// volatile - ensures change to write operation completes before read operation.
	private static volatile SingletonT instance = null; // lazy initialization
	
	private SingletonT() {
		System.out.println("Creating..");
	}
	
	// When you run the above program many times you will notice that in multithreaded environment,
	// sometimes Singleton principle works, but sometimes it violates.
	// Fix : add synchronized keyword to the getInstance() method
	/*
	public static synchronized SingletonT getInstance() {
		if (instance == null) {
			instance = new SingletonT();
		}
		return instance;
	}*/
	
	// Don't synchronize getInstance() method completely.
	// Synchronize only the block of code which is affected while creating instance.
	public static SingletonT getInstance() {
		if (instance == null) {
			synchronized (SingletonT.class) {
				// double checked locking
				if (instance == null) {
					instance = new SingletonT();
				}
			}
		}
		return instance;
	}

	static void useSingleton() {
		SingletonT singleton = SingletonT.getInstance();
		print("Singleton", singleton);
	}
	
	static void print(String name, SingletonT obj) {
		System.out.println(String.format("Object : %s, hashcode : %d", name, obj.hashCode()));
	}
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(SingletonT::useSingleton); // Object : Singleton, hashcode : 918401706
		service.submit(SingletonT::useSingleton); // Object : Singleton, hashcode : 918401706
		service.shutdown();
	}

}

/* observations :
 * When you run the above program many times you will notice that in multi-threaded environment,
 * sometimes Singleton principle works but sometimes it violates.
 * Fix 1 : After applying synchronized keyword in the getInstance () method, the program will execute 
 * properly without any issue but in Java.
 * Fix 2 : Don't synchronize complete method, instead synchronize the block the does the instance creation.
 * Fix 3 : Use Double locked checking to ensure only one thread enters the instance creation.
 * Fix 4 : Use volatile instance variable so that threads never get half-initialized instance.
*/