package com.rndayala.designpatterns.decorator;

//Concrete Component
public class SimpleCoffee implements Coffee {
	@Override
	public double getCost() {
		return 5;
	}
}
