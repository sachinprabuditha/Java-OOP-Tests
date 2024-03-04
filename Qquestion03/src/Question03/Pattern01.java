package Question03;

import java.util.Iterator;

public class Pattern01 extends Thread {
	private Object lock;
	private String pattern;
	private int count;
	
	public Pattern01(Object lock, String pattern, int count) {
		super();
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}

	@Override
	public void run() {
		synchronized (lock) {
			for (int i = 0; i < count; i++) {
				System.out.println("Pattern 1 thread -");
				for (int j = 0; j < count; j++) {
					System.out.println(" ");
				}
				for (int j = 0; j < i+1; j++) {
					System.out.println(pattern + " ");
				}
				System.out.println();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				lock.notify();
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		 
	}
	
	

}
