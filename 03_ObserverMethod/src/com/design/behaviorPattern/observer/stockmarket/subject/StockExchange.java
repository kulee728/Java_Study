package com.design.behaviorPattern.observer.stockmarket.subject;
import java.util.ArrayList;
import java.util.List;

import com.design.behaviorPattern.observer.stockmarket.observer.Observer;

public class StockExchange implements StockMarket{
	private double price;
	public List<Observer> oList;
	
	public StockExchange() {
		oList = new ArrayList<Observer>();
	}
	
	@Override
	public void addObserver(Observer o) {
		oList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		oList.remove(o);
	}

	@Override
	public void notifyObservers(double price) {
		for(Observer o : oList) {
			o.update(price);
		}
	}

}
