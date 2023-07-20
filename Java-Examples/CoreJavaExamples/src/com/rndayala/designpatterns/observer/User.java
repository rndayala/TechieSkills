package com.rndayala.designpatterns.observer;

public class User implements Observer {
	private Object article;
	
	@Override
	public void update(Subject subject) {
		article = subject.getUpdate();		
	}

	public Object getArticle() {
		return article;
	}

}
