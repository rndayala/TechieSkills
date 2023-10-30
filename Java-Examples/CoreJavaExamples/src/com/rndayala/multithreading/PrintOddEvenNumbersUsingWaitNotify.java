package com.rndayala.multithreading;

// shared resource that enables communication between threads
class PrintNumber {

	// shared state for inter-thread communication
	int number = 1;
	boolean oddNumberflag = true;

	// wait() and notify() methods should be called on synchronized method or block
	synchronized public void printEvenNumber() {
		try {
			if (oddNumberflag == true) {
				wait();
			} else {
				if (number % 2 == 0) {
					System.out.println(number);
					number = number + 1;
					oddNumberflag = true;
					notify();
				}
			}
		} catch (Exception e) {
			System.out.println("Some problem in Even");
		}
	}

	synchronized public void printOddNumber() {
		try {
			if (oddNumberflag == true) {
				if (number % 2 != 0) {
					System.out.println(number);
					number = number + 1;
					oddNumberflag = false;
					notify();
				}
			} else {
				wait();
			}
		} catch (Exception e) {
			System.out.println("Some problem in Printing Number");
		}
	}
}

// task that calls methods on shared resource based on thread
// NOTE - if needed, we can have independent tasks also here, without the if condition.
class OddEvenNumberTask implements Runnable {
	// shared state for printing number
	PrintNumber printer;

	// max value for printing numbers
	int maxVal = 0;

	public OddEvenNumberTask(PrintNumber p, int max) {
		printer = p;
		maxVal = max;
	}

	public void run() {
		int count = 0;
		String tName = Thread.currentThread().getName();

		while (count < maxVal) {
			if (tName.equals("even")) {
				printer.printEvenNumber();
			} else {
				printer.printOddNumber();
			}
			count++;
		}
	}
}

class EvenNumberTask implements Runnable {
	// shared state for printing number
	PrintNumber printer;

	// max value for printing numbers
	int maxVal = 0;

	public EvenNumberTask(PrintNumber p, int max) {
		printer = p;
		maxVal = max;
	}

	public void run() {
		int count = 0;
		String tName = Thread.currentThread().getName();

		while (count < maxVal) {
			printer.printEvenNumber();
			count++;
		}
	}
}

class OddNumberTask implements Runnable {
	// shared state for printing number
	PrintNumber printer;

	// max value for printing numbers
	int maxVal = 0;

	public OddNumberTask(PrintNumber p, int max) {
		printer = p;
		maxVal = max;
	}

	public void run() {
		int count = 0;
		String tName = Thread.currentThread().getName();

		while (count < maxVal) {
			printer.printOddNumber();
			count++;
		}
	}
}

public class PrintOddEvenNumbersUsingWaitNotify {

	public static void main(String[] args) {
		PrintNumber p = new PrintNumber();
		int max = 20;

		Thread evenThread = new Thread(new OddEvenNumberTask(p, max), "even");
		Thread oddThread = new Thread(new OddEvenNumberTask(p, max), "odd");
		
//		Thread evenThread = new Thread(new EvenNumberTask(p, max), "even");
//		Thread oddThread = new Thread(new OddNumberTask(p, max), "odd");

		evenThread.start();
		oddThread.start();
	}
}
