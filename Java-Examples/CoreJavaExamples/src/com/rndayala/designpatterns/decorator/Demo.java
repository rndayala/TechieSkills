package com.rndayala.designpatterns.decorator;

//Usage
public class Demo {
	public static void main(String[] args) {
		Coffee simpleCoffee = new SimpleCoffee();
		Coffee coffeeWithMilkAndSugar = new MilkDecorator(new SugarDecorator(simpleCoffee));

		System.out.println("Cost of Simple Coffee: " + simpleCoffee.getCost()); // Output: Cost of Simple Coffee: 5
		System.out.println("Cost of Coffee with Milk and Sugar: " + coffeeWithMilkAndSugar.getCost()); // Output: Cost of
																									// Coffee with Milk
																									// and Sugar: 8
	}
}
