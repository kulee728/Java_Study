package com.logger.singleton;

public class SingletonEx2 {
	private SingletonEx2() {
		
	}
	public SingletonEx2 getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	private static class LazyHolder{
		private static final SingletonEx2 INSTANCE = new SingletonEx2();
	}
	
}
