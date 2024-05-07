package com.design.behaviorPattern.observer.stockmarket.subject;

import com.design.behaviorPattern.observer.stockmarket.observer.Observer;

public interface StockMarket {
	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers(double price);
}
