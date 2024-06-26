package com.logger.singleton;

import java.util.logging.Logger;

public class SingletonEx {
	//field (static)
	//private static SingletonEx instance = new SingletonEx(); //lock 방식 (1) : 이른 초기화(eager initialization : 불필요한 메모리 할당)
	private Logger logger;
	public int label = 0;
	private SingletonEx() {
		logger = Logger.getLogger(SingletonEx.class.getName());
	}

	/*lock 방식 (2) - synchronized constructor/methods 
	아래 방식은 여러 thread 가 생성자에 접근할 때마다 불필요하게 lock 을 걸게 된다.
	public static synchronized SingletonEx getInstance() {
		if(instance==null)
			instance = new SingletonEx();
		return
			instance;
	}*/
	
	/*lock 방식 (3) - DCL (Double Checked Locking), 이제는 사용하지 않는다.
	이 방식은 최초 접근시(인스턴스 존재 X)에만 lock을 걸어 불필요한 lock 을 최소화한다.
	이 방식도 문제가 있는데, 낮은 확률로 visibility 문제가 발생한다.
	(하나의 쓰레드가 업데이트 한 값을 확인 할 수 없는 문제)
	public static SingletonEx getInstance() {
		if(instance==null) {
			synchronized(SingletonEx.class) {
				if(instance==null)
					instance = new SingletonEx();
			}
		}
		return instance;
	}*/
	
	
	/*lock 방식 (4) - LazyHolder (static inner class의 구현)
	  getInstance 에서 static 메서드 lazyHolder의 정적"클래스" 내 상수 INSTANCE 를 반환한다.
	 클래스를 로드하고 초기화 하는것은 thread safe 보장된다!*/
	public static SingletonEx getInstance() {
		return LazyHolder.INSTANCE;
	}
	private static class LazyHolder{
		private static final SingletonEx INSTANCE = new SingletonEx();
	}
	
	public void logInfo(String message) {
		logger.info(message);
	}
	
}
