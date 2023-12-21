package com.rndayala.springcore.beans;

public class FirstFlight implements DeliveryService {

	static {
		System.out.println("FirstFlight class is loaded.");
	}
	
	public FirstFlight() {
		System.out.println("FirstFlight class is instantiated");
	}
	
	public boolean courierService(double amount) {
		System.out.println("Delivery Service using FirstFlight courier service : " + amount);
		return true;
	}
}
