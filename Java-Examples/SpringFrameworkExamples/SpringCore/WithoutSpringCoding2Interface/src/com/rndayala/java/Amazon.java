package com.rndayala.java;

// Loose coupling example
// target class
public class Amazon {
	
	// FedEx, BlueDart, FirstFlight -- these are all dependent objects
	private DeliveryService service;

	public void setService(DeliveryService service) {
		this.service = service;
	}
	
	public boolean initiateDelivery(double amount) {
		return service.courierService(amount);
	}
}
