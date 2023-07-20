package com.rndayala.designpatterns.builder;

/**
 * This Director approach is used when we want to build different unrelated products.
 * However, those products use the same object construction steps.
 * If you observe, the construction methods are not returning any object. 
 * Director only specifies the sequence of steps, but does not know what product is being built.
 * 
 * Director defines the sequence/order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */

public class Director {

    public void constructSportsCar(Builder builder) {
    	// specifies the sequence or order of the steps
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());

    }

    public void constructCityCar(Builder builder) {
    	// specifies the sequence or order of the steps
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
    	// specifies the sequence or order of the steps
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
}
