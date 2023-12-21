package com.rndayala.javaapp;

import java.util.Date;

public class LaunchApp {

	public static void main(String[] args) {
		GreetingsGenerator greet = new GreetingsGenerator();
		System.out.println("Target object before injecting dependent object => " + greet);
		
		greet.setDate(new Date()); // setter injection
		
		System.out.println("Target object after injecting dependent object => " + greet);
		
		// invoking business logic
		String msg = greet.generateGreeting("Raghu");
		System.out.println(msg);
		
		
	}

}
