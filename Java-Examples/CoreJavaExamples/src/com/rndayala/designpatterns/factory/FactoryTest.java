package com.rndayala.designpatterns.factory;

public class FactoryTest {

	public static void main(String[] args) {
		
		// the factory class that creates objects of  the Shape interface.
		FactoryClass factory = new FactoryClass();
		
		// create objects of  the Shape interface by calling the getShape method 
		// and passing the appropriate String argument. 
		// Type of object to create is determined at runtime by user.
		// NOTE - We code against interface. Higher level modules doesn't depend on lower level classes. 
		Shape shape = factory.getShape("Circle");
		shape.draw();
		
		shape = factory.getShape("Square");
		shape.draw();
		
		shape = factory.getShape("Rectangle");
		shape.draw();
	}

}
