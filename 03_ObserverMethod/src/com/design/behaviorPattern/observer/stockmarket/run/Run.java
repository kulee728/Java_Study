package com.design.behaviorPattern.observer.stockmarket.run;

import com.design.behaviorPattern.observer.stockmarket.observer.Observer;
import com.design.behaviorPattern.observer.stockmarket.observer.StockUser;
import com.design.behaviorPattern.observer.stockmarket.subject.StockExchange;

public class Run {

	public static void main(String[] args) {
		String [] names = {"보베라1","데란드2","젠3","그런드4","아이몬5","요한6","멜비라스7","레안8","스커미나9","터넬10"};
		Observer[] oArr = new Observer[names.length];
		StockExchange se = new StockExchange();
		int cnt = 0;
		for(int i=0;i<names.length;i++) {
			oArr[i] = new StockUser(names[i],Math.random()*200000);
			se.addObserver(oArr[i]);
			
		}
		se.notifyObservers(5000);
		System.out.println("=============================주식변동==============================");
		for(Observer o :oArr) {
			o.buyStock((int)(Math.random()*10));
		}
		se.notifyObservers(500);
		
	}

}
