package com.rndayala.designpatterns.prototype;

//Product interface
public interface Product extends Cloneable {
	void setName(String name);

	String getName();

	void setPrice(double price);

	double getPrice();

	Product clone();
}
