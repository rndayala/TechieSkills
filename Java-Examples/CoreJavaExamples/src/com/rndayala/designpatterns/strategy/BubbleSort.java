package com.rndayala.designpatterns.strategy;

//Concrete Strategy
class BubbleSort implements SortingStrategy {
	
	@Override
	public void sort(int[] array) {
		// Implementation of Bubble Sort
		System.out.println("Sorting using Bubble Sort");
	}
}
