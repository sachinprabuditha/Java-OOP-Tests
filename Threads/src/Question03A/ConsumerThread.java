package Question03A;

import java.util.ArrayList;
import java.util.Queue;

public class ConsumerThread extends Thread {
	ArrayList<Integer> queue = new ArrayList<Integer>();
	Object lock = new Object();

	public ConsumerThread(ArrayList<Integer> queue) {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		while(true) {
			synchronized (lock) {
				try {	
				while(queue.isEmpty()) {
					
						lock.wait();
				}
				int value = queue.remove(0);
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
