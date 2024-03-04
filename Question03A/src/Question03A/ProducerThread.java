package Question03A;

import java.util.ArrayList;

public class ProducerThread extends Thread{
	private final ArrayList<Integer> queue;
	private boolean running;
	

	public ProducerThread(ArrayList<Integer> queue) {
		this.queue = queue;
		this.running = true;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(running) {
			synchronized(queue) {
				try {
					int value = queue.size() * 10 + 10;
					System.out.println("Producer Started");
					System.out.println("Producer adding value = "+ value + " to Queue");
					queue.add(value);
					queue.notify();
					queue.wait();
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
