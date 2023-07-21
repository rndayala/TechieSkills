package com.rndayala.designpatterns.decorator2;

//Concrete Decorators
class BoldTextDecorator extends TextDecorator {
	public BoldTextDecorator(TextFormatter textFormatter) {
		super(textFormatter);
	}

	// adding decoration
	@Override
	public String format(String text) {
		String formattedText = super.format(text);
		return "<b>" + formattedText + "</b>";
	}
}
