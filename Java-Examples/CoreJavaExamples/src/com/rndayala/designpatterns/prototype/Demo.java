package com.rndayala.designpatterns.prototype;

//Client code

public class Demo {

	public static void main(String[] args) {

		Product shirt1 = new Shirt("Basic Shirt", 25.0);
		Product pant1  = new Pants("Casual Pants", 40.0);
		Product shoe1  = new Shoes("Sports Shoes", 60.0);

		Product shirt2 = shirt1.clone();
		shirt2.setName("Fancy Shirt");

		Product pant2 = pant1.clone();
		pant2.setPrice(50.0);

		System.out.println("Shirt: " + shirt2.getName() + ", Price: $" + shirt2.getPrice());
		System.out.println("Pants: " + pant2.getName() + ", Price: $" + pant2.getPrice());
		System.out.println("Shoes: " + shoe1.getName() + ", Price: $" + shoe1.getPrice());

	}

}
