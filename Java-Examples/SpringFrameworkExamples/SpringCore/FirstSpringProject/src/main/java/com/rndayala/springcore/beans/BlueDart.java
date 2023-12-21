package com.rndayala.springcore.beans;

public class BlueDart implements DeliveryService {

	static {
		System.out.println("BlueDart class is loaded.");
	}
	
	public BlueDart() {
		System.out.println("BlueDart class is instantiated");
	}
	
	public boolean courierService(double amount) {
		System.out.println("Delivery Service using BlueDart courier service : " + amount);
		return true;
	}
}
