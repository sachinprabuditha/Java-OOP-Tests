package Question03A;

import java.util.ArrayList;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> queue = new ArrayList<>();
			ProducerThread producer = new ProducerThread(queue);
			ConsumerThread consumer = new ConsumerThread(queue);
			
			producer.start();
			consumer.start();
			
			System.out.println("Starting");
			
			try {
				Thread.sleep(5000);
				producer.stopThread();
				consumer.stopThread();
				producer.join();
				consumer.join();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}

	}

}
