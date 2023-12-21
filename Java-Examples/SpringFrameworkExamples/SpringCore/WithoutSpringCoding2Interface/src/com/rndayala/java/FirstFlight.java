package com.rndayala.java;

public class FirstFlight implements DeliveryService {

	@Override
	public boolean courierService(double amount) {
		System.out.println("Delivery Service using FirstFlight courier service " + amount);
		return true;
	}

}
