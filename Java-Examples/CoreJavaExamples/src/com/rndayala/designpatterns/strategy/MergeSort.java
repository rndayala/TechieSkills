package com.rndayala.designpatterns.strategy;

//Concrete Strategy
class MergeSort implements SortingStrategy {
	
	@Override
	public void sort(int[] array) {
		// Implementation of Merge Sort
		System.out.println("Sorting using Merge Sort");
	}
}
