package com.rndayala.designpatterns.observable;

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
