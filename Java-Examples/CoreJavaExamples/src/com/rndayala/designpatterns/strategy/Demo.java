package com.rndayala.designpatterns.strategy;

public class Demo {
	
	public static void main(String[] args) {
		int[] data = { 5, 2, 7, 1, 3 };

		SortingContext context = new SortingContext();

		// Use BubbleSort
		context.setStrategy(new BubbleSort());
		context.sortArray(data);

		// Use MergeSort
		context.setStrategy(new MergeSort());
		context.sortArray(data);
	}
}
