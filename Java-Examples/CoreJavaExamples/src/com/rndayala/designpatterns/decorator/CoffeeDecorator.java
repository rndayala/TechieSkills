package com.rndayala.designpatterns.decorator;

//Decorator implements Component interface
abstract class CoffeeDecorator implements Coffee {
	// wrapped Component object
	protected Coffee coffee;

	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}
}