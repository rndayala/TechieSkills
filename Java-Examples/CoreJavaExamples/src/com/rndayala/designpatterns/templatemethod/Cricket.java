package com.rndayala.designpatterns.templatemethod;

public class Cricket extends Game {
	
	@Override
	void startPlay() {
		System.out.println("Cricket Game started. Enjoy the Game!");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished.");
	}
}
