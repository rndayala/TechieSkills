package com.rndayala.designpatterns.builder2;

public class Demo {
	public static void main(String[] args) {
		// Create Builder 
		CarBuilder carBuilder = new ConcreteCarBuilder();
		
		// Create Director that specifies the sequence/order of building the complex object
		// Director uses the Builder object
		Director director = new Director();
		
		// Using director to create : Sports - AUTO car
		Car car = director.buildSportsAutoCar(carBuilder);
		System.out.println(car);
		
		// Using director to create : Sports - MANUAL car
		car = director.buildSportsManualCar(carBuilder);
		System.out.println(car);
		
		// Creating concrete product class directly using Builder
		// Create : SUV - SEMI AUTOMATIC car 
		Car suv = carBuilder.setCarType(CarType.SUV)
        		.setSeats(4)
        		.setEngine(new Engine(2.5, 0))
        		.setTransmission(Transmission.SEMI_AUTOMATIC)
        		.setGPSNavigator(new GPSNavigator())
        		.build();
		System.out.println(suv);
	}
}
