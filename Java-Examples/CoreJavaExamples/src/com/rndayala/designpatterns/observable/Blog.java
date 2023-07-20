package com.rndayala.designpatterns.observable;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject class 
public class Blog implements Subject {
	// Concrete Subject maintains list of observers
	private List<Observer> observers = null;
	// this instance variable maintains the state of Concrete subject
	private String blogContent;
	
	public Blog() {
		System.out.println("Initializing subject(blog)..");
		this.observers = new ArrayList<Observer>();
		blogContent = "";
	}
	
	@Override
	public void registerObserver(Observer observer) {
		System.out.println("registering an observer!");
		observers.add(observer);
		
	}
	
	@Override
	public void unregisterObserver(Observer observer) {
		System.out.println("un-registering an observer!");
		observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {		
		for (Observer observer : observers) {
			observer.update(this);
			System.out.println("Observer notified!!");
		}
	}
	
	@Override
	public Object getUpdate() {
		return blogContent;
	}
	
	// when the state of subject changes, we need to notify observers
	public void postNewArticle(String data) {
		blogContent = data;
		notifyObservers();
	}
	
	public List<Observer> getObserversList() {
		return observers;
	}
}
