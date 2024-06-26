package com.logger.singleton;

public class MainEx implements Runnable{
	private SingletonEx seInstance;
	
	public static void main(String[] args) {
		try {
		Thread [] t = new Thread [10000];
		// TODO Auto-generated method stub
		double start = System.nanoTime();
		for(int i =0;i<100;i++) {
			t[i] = new Thread(new MainEx());
			t[i].start();
		}
		for(int i=0;i<100;i++) {
				t[i].join();
				//System.out.println(i+" thread clear" );
			
		}
		double end = System.nanoTime();
		
		System.out.println("lapsed time is : "+(end-start)/10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		int tid = this.hashCode()%10000;
		seInstance = SingletonEx.getInstance();
		//System.out.println("Thread "+tid+" on the way!");
		seInstance.logInfo(String.valueOf(tid));
		System.out.println("Instance hashcode : "+seInstance.hashCode()%100000+", label is "+ ++seInstance.label);
	}

}
