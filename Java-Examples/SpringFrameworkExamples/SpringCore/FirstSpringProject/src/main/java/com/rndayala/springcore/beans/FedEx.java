package com.rndayala.springcore.beans;

public class FedEx implements DeliveryService {

	static {
		System.out.println("FedEx class is loaded.");
	}
	
	public FedEx() {
		System.out.println("FedEx class is instantiated");
	}
	
	public boolean courierService(double amount) {
		System.out.println("Delivery Service using FedEx courier service : " + amount);
		return true;
	}

}
