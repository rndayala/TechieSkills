package com.rndayala.designpatterns.prototype;

//Concrete product class: Pants
public class Pants implements Product {
	private String name;
	private double price;

	public Pants(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public Product clone() {
		return new Pants(this.name, this.price);
	}
}
