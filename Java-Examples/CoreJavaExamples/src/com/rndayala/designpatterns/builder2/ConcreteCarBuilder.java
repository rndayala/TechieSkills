package com.rndayala.designpatterns.builder2;

public class ConcreteCarBuilder implements CarBuilder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    public CarBuilder setCarType(CarType type) {
        this.type = type;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    // Concrete Builder - provides a method for retrieving the final product.
    public Car build() {
        return new Car(type, seats, engine, transmission, gpsNavigator);
    }
}
