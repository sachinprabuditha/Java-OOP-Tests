package Question03A;

import java.util.ArrayList;

public class ConsumerThread extends Thread{
	private final ArrayList<Integer> queue;
	private boolean running;

	public ConsumerThread(ArrayList<Integer> queue) {
		this.queue = queue;
		this.running = true;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (running) {
			synchronized(queue) {
				try {
					if(queue.isEmpty()) {
						queue.notify();
						queue.wait();
					}
					int value = queue.remove(0);
					System.out.println("Consumer Started");
					System.out.println("Consumer thread consumes " + value);
					System.out.println("Elements in queue = " + queue);
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
	public void stopThread() {
		running = false;
	}
	

}
