package com.rndayala.designpatterns.decorator2;

public class Demo {
	public static void main(String[] args) {
		TextFormatter plainFormatter = new PlainTextFormatter();
		TextFormatter boldFormatter = new BoldTextDecorator(plainFormatter);
		TextFormatter boldItalicFormatter = new ItalicTextDecorator(boldFormatter);
		String text = "Hello, world!";
		String formattedText = boldItalicFormatter.format(text);
		System.out.println(formattedText); // Output: <i><b>Hello, world!</b></i>
	}
}
