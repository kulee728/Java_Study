package com.design.behaviorPattern.observer.blognews.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.design.behaviorPattern.observer.blognews.observer.Subscriber;

public class BlogSite implements Blog{
	Map<Category,List<Subscriber>> subscriberMap;
	
	public BlogSite() {
		subscriberMap = new HashMap<>();
	}
	
	@Override
	public void notifySubscriber(Category c, String articleTitle) {
		List<Subscriber> categorySubscribers = subscriberMap.getOrDefault(c,new ArrayList<Subscriber>());
		for(Subscriber s: categorySubscribers) {
			s.update(articleTitle);
		}
	}

	@Override
	public void removeSubscriber(Category c, Subscriber s) {
		List<Subscriber> categorySubscribers = subscriberMap.getOrDefault(c, null);
		if(categorySubscribers!=null) {
			if(!categorySubscribers.remove(s))
				System.out.println("구독자 삭제가 정상적으로 완료되지 않았습니다.");
		}
		else
			System.out.println("구독자 삭제가 정상적으로 완료되지 않았습니다.");
	}

	@Override
	public void addSubscriber(Category c, Subscriber s) {
		List<Subscriber> categorySubscribers = subscriberMap.getOrDefault(c,new ArrayList<>());
		categorySubscribers.add(s);
		subscriberMap.put(c, categorySubscribers);
	}

	@Override
	public void writeArticle(List<Category> cL, String articleTitle) { //하나의 article 여러개 categories
		for(Category c : cL) {
			System.out.println();
			System.out.println();
			System.out.println("-----카테고리 "+c+"에 대하여-----");
			notifySubscriber(c,articleTitle);
			System.out.println("----------------------------");
			System.out.println();
			System.out.println();
		}
		
	}

	@Override
	public String toString() {
		return "BlogSite [subscriberMap=" + subscriberMap + "]";
	}

}