package com.design.behaviorPattern.observer.blognews.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.design.behaviorPattern.observer.blognews.observer.Subscriber;
import com.design.behaviorPattern.observer.blognews.observer.Viewers;
import com.design.behaviorPattern.observer.blognews.subject.Blog;
import com.design.behaviorPattern.observer.blognews.subject.Blog.Category;
import com.design.behaviorPattern.observer.blognews.subject.BlogSite;

public class NewsBlogClient {

	public static void main(String[] args) {
		Blog bs = new BlogSite();
		List<Subscriber> subscriberList = new ArrayList<>();
		for(int i=0;i<5;i++) {
			String name = "James "+(char)(i+65)+". Mcavoy";
			subscriberList.add(new Viewers(name));
		}
		for(Subscriber s : subscriberList) {
			Category[] c = Category.values();
			bs.addSubscriber(c[(new Random()).nextInt(4)], s);
		}
		List<Category> c = new ArrayList<>();
		c.add(Category.HEALTH);
		c.add(Category.TECH);
		bs.writeArticle(c, "헬스테크는 누구를 위한 것일까?");
		System.out.println(bs.toString());
		
	}

}