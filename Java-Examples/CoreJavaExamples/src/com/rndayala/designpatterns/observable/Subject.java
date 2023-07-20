package com.rndayala.designpatterns.observable;

// Subject interface
public interface Subject {
	void registerObserver(Observer observer);
	void unregisterObserver(Observer observer);
	void notifyObservers();
	Object getUpdate();
}
