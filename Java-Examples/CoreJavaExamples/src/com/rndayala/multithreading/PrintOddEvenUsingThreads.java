package com.rndayala.multithreading;

class PrintOddEvenNumbers implements Runnable {
    
    String lock = new String();
    private static int i = 1;
    
    public void run() {
        
        String tName = Thread.currentThread().getName();
        
        while ( i <= 10) {
    
            if (tName.equals("evenThread")) {
                try {
                    Thread.sleep(1000);
                    synchronized(lock) {
                        System.out.println(i);
                        i = i + 1;
                    }
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    synchronized(lock) {
                        System.out.println(i);
                        i = i + 1;
                    }
                    Thread.sleep(1000);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


public class PrintOddEvenUsingThreads {

	public static void main(String[] args) {
		Runnable task = new PrintOddEvenNumbers();
        Thread evenThread = new Thread(task);
        Thread oddThread = new Thread(task);
        
        evenThread.start();
        oddThread.start();
	}
}
