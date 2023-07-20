package com.rndayala.designpatterns.strategy;

//Context class
class SortingContext {
	private SortingStrategy strategy;

	public void setStrategy(SortingStrategy strategy) {
		this.strategy = strategy;
	}

	public void sortArray(int[] array) {
		strategy.sort(array);
	}
}