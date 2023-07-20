package com.rndayala.designpatterns.factory;

public class FactoryTest {

	public static void main(String[] args) {
		
		// create objects of  the Shape interface by calling the getShape method 
		// and passing the appropriate String argument. 
		// Type of object to create is determined at runtime by user.
		// NOTE - We code against interface. Higher level modules doesn't depend on lower level classes. 
		Shape shape = ShapeFactory.getShape("Circle");
		shape.draw();
		
		shape = ShapeFactory.getShape("Square");
		shape.draw();
		
		shape = ShapeFactory.getShape("Rectangle");
		shape.draw();
	}

}
