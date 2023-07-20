package com.rndayala.designpatterns.observer;

// Subject interface
public interface Subject {
	void registerObserver(Observer observer);
	void unregisterObserver(Observer observer);
	void notifyObservers();
	Object getUpdate();
}
