package com.rndayala.java;

public class FedEx implements DeliveryService {

	@Override
	public boolean courierService(double amount) {
		System.out.println("Delivery Service using FedEx courier service : " + amount);
		return true;
	}

}
