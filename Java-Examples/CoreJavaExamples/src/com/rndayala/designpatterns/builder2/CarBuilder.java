package com.rndayala.designpatterns.builder2;

/**
 * Builder interface defines all possible ways to configure a product.
 * The interface declares all the methods to construct the complex object.
 * 
 * It sets a property and return the same object again.
 * Finally, we have a build() method that constructs the final product object and returns it.
 */
public interface CarBuilder {
	CarBuilder setCarType(CarType type);
	CarBuilder setSeats(int seats);
	CarBuilder setEngine(Engine engine);
	CarBuilder setTransmission(Transmission transmission);
	CarBuilder setGPSNavigator(GPSNavigator gpsNavigator);
	Car build();
	
}
