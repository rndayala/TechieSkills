package com.rndayala.springcore.beans;

//Loose coupling example
//target class
public class Amazon {
	
	// FedEx, BlueDart, FirstFlight -- these are all dependent objects
	private DeliveryService service;
	
	static {
		System.out.println("Amazon class is loaded.");
	}
	
	public Amazon() {
		System.out.println("Amazon class is instantiated.");
	}
	
	public Amazon(DeliveryService service) {
		this.service = service;
		System.out.println("Amazon Parameterized constructor is called");
	}

	public void setService(DeliveryService service) {
		this.service = service;
		System.out.println("setter method is called");
	}
	
	public boolean initiateDelivery(double amount) {
		return service.courierService(amount);
	}
}