package com.rndayala.designpatterns.builder2;

public class Director {
	public Car buildSportsAutoCar(CarBuilder builder) {
		// specifies the sequence or order of the steps
        Car car = builder.setCarType(CarType.SPORTS_CAR)
        		.setSeats(2)
        		.setEngine(new Engine(3.0, 0))
        		.setTransmission(Transmission.AUTOMATIC)
        		.setGPSNavigator(new GPSNavigator())
        		.build();
        return car;
        
	}
	
	public Car buildSportsManualCar(CarBuilder builder) {
		// specifies the sequence or order of the steps
        Car car = builder.setCarType(CarType.SPORTS_CAR)
        		.setSeats(2)
        		.setEngine(new Engine(2.0, 0))
        		.setTransmission(Transmission.MANUAL)
        		.setGPSNavigator(new GPSNavigator())
        		.build();
        return car;
        
	}
}
