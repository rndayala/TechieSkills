package com.rndayala.designpatterns.decorator2;

//Concrete Component - represents the original object to be decorated
//specifies core functionality without any decoration
class PlainTextFormatter implements TextFormatter {
	@Override
	public String format(String text) {
		return text;
	}
}
