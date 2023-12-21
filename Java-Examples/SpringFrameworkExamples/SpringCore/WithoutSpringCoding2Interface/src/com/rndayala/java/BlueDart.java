package com.rndayala.java;

public class BlueDart implements DeliveryService {

	@Override
	public boolean courierService(double amount) {
		System.out.println("Delivery Service using BlueDart courier service : " + amount);
		return true;
	}

}
