package com.rndayala.designpatterns.singleton;

/**
 * This class demonstrates creating Singleton object using Bill Pugh method.
 * The Bill Pugh Singleton pattern, also known as the Initialization-on-demand Holder Idiom, 
 * is an improvement over the traditional Singleton pattern.
 * This approach is based on inner static helper class which encapsulates the Singleton instance.
 * 
 * @author rndayala
 *
 */

public class SingletonH {
	
	// Private constructor to prevent instantiation from other classes
    private SingletonH() {
        // Initialization code (if any) goes here
    	System.out.println("Creating..");
    }

    // Inner static helper class responsible for holding the Singleton instance
    private static class SingletonHolder {
        // The Singleton instance is created when the class is loaded
        private static final SingletonH INSTANCE = new SingletonH();
    }

    // Public static method to get the Singleton instance
    // return the Singleton instance held by the SingletonHolder
    public static SingletonH getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
	static void print(String name, SingletonH obj) {
		System.out.println(String.format("Object : %s, hashcode: %d", name, obj.hashCode()));
	}

    // Other methods and fields...

	public static void main(String[] args) {
		SingletonH s1 = SingletonH.getInstance(); // Object : s1, hashcode: 366712642
		SingletonH s2 = SingletonH.getInstance(); // Object : s2, hashcode: 366712642
		
		print("s1", s1);
		print("s2", s2);
	}

}
