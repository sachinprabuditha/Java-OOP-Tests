package Question03A;

import java.util.ArrayList;
import java.util.Queue;

public class ProducerThread extends Thread {
	ArrayList<Integer> queue = new ArrayList<Integer>();
	Object lock = new Object();

	public ProducerThread(ArrayList<Integer> queue) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		while(true) {
			
			synchronized (lock) {
				while(!queue.isEmpty()) {
					try {
						lock.wait();
						
					int value = 10;
					queue.add(value);
					System.out.println("Producer Started");
					System.out.println("Producer adding values = " + value + "to Queue");
					System.out.println("Elements in Queue = " + queue);
					
					lock.notify();
					Thread.sleep(1000);
							
					}
					
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	

}
