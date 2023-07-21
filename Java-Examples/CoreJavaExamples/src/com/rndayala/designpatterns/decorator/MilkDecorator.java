package com.rndayala.designpatterns.decorator;

//Concrete Decorators extends Base Decorator class
class MilkDecorator extends CoffeeDecorator {
	public MilkDecorator(Coffee coffee) {
     super(coffee);
 }

	@Override
	public double getCost() {
		return coffee.getCost() + 2;
	}
}
