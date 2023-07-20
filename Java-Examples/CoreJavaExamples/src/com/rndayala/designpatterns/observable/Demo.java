package com.rndayala.designpatterns.observable;

import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Observer> list = null;
		
		Blog blog = new Blog();
		User user1 = new User();
		User user2 = new User();
		
		// registering multiple observers with the subject
		blog.registerObserver(user1);
		blog.registerObserver(user2);
		
		// change state of subject by posting a new article
		blog.postNewArticle("Observer pattern Explained!!");
		
		list = blog.getObserversList();
		for(Observer observer : list) {
			System.out.println("Get content : " + ((User)observer).getArticle());
		}		
		
		// removing an observer
		blog.unregisterObserver(user2);
		
		// change state of subject
		blog.postNewArticle("Singleton pattern Explained!!");
		
		list = blog.getObserversList();
		for(Observer observer : list) {
			System.out.println("Get content : " + ((User)observer).getArticle());
		}
	}
}
