package com.rndayala.designpatterns.singleton;

public enum SingletonEnum {
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
