package com.rndayala.designpatterns.factory;

// Author : Raghunath Dayala

/* Pattern. Factory is a design pattern that provides an interface  for creating objects in a superclass, 
 * but allows subclasses to alter the type of objects that will be  created.
 * 
 * This pattern is used to create objects without specifying the exact class of object that will be created.
 * 
 * In the Factory design pattern, you have a factory class that creates objects of different types. 
 * When you ask the factory to create an object, you specify the type of object you want.
 * 
 * Think of factory as "object making machine". You tell factory what you want, and it creates the object for you.
 * 
 * The Factory Design Pattern is used in situations where you need to 'create objects of similar types', 
 * but the type of objects to be created can be decided at runtime. Delegate the instantiation logic.

 */

public class FactoryClass {
	
	//use getShape method to get object of type shape 
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
			// TODO : Add Triangle class which implements Shape interface
		}
		return null;
	}
}