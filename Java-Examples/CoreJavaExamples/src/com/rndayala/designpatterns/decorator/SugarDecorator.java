package com.rndayala.designpatterns.decorator;

class SugarDecorator extends CoffeeDecorator {
	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public double getCost() {
		return coffee.getCost() + 1;
	}
}
