package com.rndayala.designpatterns.builder;

/**
 * Builder interface defines all possible ways to configure a product.
 * The interface declares all the methods to construct the complex object.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
