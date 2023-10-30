package com.rndayala.multithreading;

// this code is an example of inter-thread communication
// producer consumer problem - solution

class Producer extends Thread {
	Queue q;

	// constructor injection
	public Producer(Queue q) {
		this.q = q;
	}

	public void run() {
		int count = 1;
		while (count < 200) {
			q.put();
			count++;
		}
	}
}

class Consumer extends Thread {
	Queue q;

	// constructor injection
	public Consumer(Queue q) {
		this.q = q;
	}

	public void run() {
		int count = 1;
		while (count <= 200) {
			q.get();
			count++;
		}
	}
}

class Queue {
	int i = 1;
	int data; 
	boolean flag = false;

	public synchronized void put() {
		try {
			if (flag == true) {
				wait();
			} else {
				// produce the data
				data = i;
				System.out.println("I have produced the data : " + i);
				i = i + 1;
				flag = true;
				notify();  // notify() method should be called after updating flag
			}
		} catch (Exception e) {
			System.out.println("Some problem in Put method");
		}
	}

	public synchronized void get() {
		try {
			if (flag == false) {
				wait();
			} else {
				System.out.println("I have consumed data : " + data);
				flag = false;
				notify();
			}
		} catch (Exception e) {
			System.out.println("Some problem in get method");
		}
	}
}

public class ProducerConsumerExample {

	public static void main(String[] args) {
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

		p.start();
		c.start();
	}

}
