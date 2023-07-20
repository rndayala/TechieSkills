package com.rndayala.designpatterns.templatemethod;

public class Demo {
	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		
		System.out.println();
		
		game = new Football();
		game.play();
	}
}
