package Q3;

public class TestThreads {

	public static void main(String[] args) {
		
		Object lock = new Object();
		Thread plusThread = new Thread(new PlusThread(lock, 5, 10));
		Thread multiplyThread = new Thread(new MultiplyThread(lock, 5, 10));
		plusThread.start();
		multiplyThread.start();
		
		try {
			plusThread.join();
			multiplyThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


