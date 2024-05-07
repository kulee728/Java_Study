package com.design.behaviorPattern.observer.blognews.subject;

import java.util.List;

import com.design.behaviorPattern.observer.blognews.observer.Subscriber;

public interface Blog {
	void notifySubscriber(Category c,String articleTitle);
	void removeSubscriber(Category c,Subscriber s);
	void addSubscriber(Category c,Subscriber s);
	void writeArticle(List<Category> cL,String articleTitle);
	enum Category {
	    TECH, SPORTS, POLITICS, HEALTH
	};

}
