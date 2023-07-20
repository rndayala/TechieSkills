package com.rndayala.designpatterns.templatemethod;

public class Football extends Game {
	
	@Override
	void startPlay() {
		System.out.println("Football Game started. Enjoy the Game!");
	}

	@Override
	void endPlay() {
		System.out.println("Football Game Finished.");
	}
}
