package com.rndayala.designpatterns.decorator2;

// Abstract Decorator base class that implements the Component interface
// provides additional functionality by delegating to the wrapped component object
abstract class TextDecorator implements TextFormatter {
	// wrapped component object
	private TextFormatter textFormatter;

	public TextDecorator(TextFormatter textFormatter) {
		this.textFormatter = textFormatter;
	}

	@Override
	public String format(String text) {
		return textFormatter.format(text);
	}
}