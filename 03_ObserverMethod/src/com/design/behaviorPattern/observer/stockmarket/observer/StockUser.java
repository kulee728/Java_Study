package com.design.behaviorPattern.observer.stockmarket.observer;

import java.util.HashMap;
import java.util.Map;

public class StockUser implements Observer {
	private String name;
	private double accountBalance;
	private int stockQuantity;
	private double stockPrice;
	
	public StockUser(String name, double accountBalance) {
		this.name = name;
		this.accountBalance = accountBalance;
		stockQuantity = 0;
		stockPrice = 0;
	}
	
	@Override
	public void update(double price) {
		stockPrice = price;
		double asset = accountBalance + stockQuantity*stockPrice;
		System.out.printf("%s님> 주식 가격변동 (%.1f원), \n예금 잔액: %.1f원\n총 자산 평가액 : %.1f원\n",name,price,accountBalance,asset);
		System.out.println();
	}
	
	public void buyStock(int quantity) {
		//System.out.println(name+"님 " +quantity+"주 구매 완료");
		stockQuantity += quantity;
		accountBalance -= stockQuantity*stockPrice;
		//System.out.printf("%s님, 주식 수량이 변동되었습니다. (%d주 보유중), 예금 잔액은 %.1f원 입니다.\n",name,stockQuantity,accountBalance);

	}

}