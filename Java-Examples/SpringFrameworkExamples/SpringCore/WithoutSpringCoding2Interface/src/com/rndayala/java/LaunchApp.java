package com.rndayala.java;

public class LaunchApp {

	public static void main(String[] args) {

		Amazon a = new Amazon();
		
		a.setService(new FedEx()); // setter injection
		
		boolean b = a.initiateDelivery(1000.0);
	}

}
