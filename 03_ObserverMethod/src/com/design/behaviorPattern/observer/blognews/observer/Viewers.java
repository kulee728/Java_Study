package com.design.behaviorPattern.observer.blognews.observer;

public class Viewers implements Subscriber {

	private String name;
	public Viewers(String name) {
		this.name = name;
	}
	
	@Override
	public void update(String articleTitle) {
		System.out.println(name+"님, 새로운 글 \""+articleTitle+"\"이 등록되었습니다." );
	}

}
