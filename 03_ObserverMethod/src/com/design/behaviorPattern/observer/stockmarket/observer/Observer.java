package com.design.behaviorPattern.observer.stockmarket.observer;

public interface Observer {
	void update (double price);
	void buyStock(int quantity);
}
