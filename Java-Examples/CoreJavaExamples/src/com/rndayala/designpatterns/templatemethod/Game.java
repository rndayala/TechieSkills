package com.rndayala.designpatterns.templatemethod;


// The Template Method design pattern is used in situations 
// where you want to define the skeleton of an algorithm, but allow subclasses 
// to provide the implementation for some of the steps.

public abstract class Game {
	
	// common functionality defined in abstract (base) class
	public void initialize() {
		System.out.println("Welcome to EA Sports. Game Initialized..");
	}
	
	// specific functionality to be implemented by subclasses
	abstract void startPlay();
	abstract void endPlay();
	
	// template method - a set of steps to be followed in a specific order to solve the problem,
	// we usually make this method final
	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}

}
