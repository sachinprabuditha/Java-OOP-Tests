package Ques02b;

public class MainThreadApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Calculation cal = new Calculation();
		
		int total = 40;
		int threadCount = 4;
		int range = total/ threadCount;
		Thread[] threads = new Thread[threadCount];
		
		for(int i=0 ; i<threadCount; i++) {
			threads[i] = new Thread();
		}
		
		for (Thread thread : threads) {
			thread.start();
		}
		
		for (Thread thread : threads) {
			thread.join();
		}
		System.out.println("The factorial of 40 is: " + cal.getAns());

	}

}
