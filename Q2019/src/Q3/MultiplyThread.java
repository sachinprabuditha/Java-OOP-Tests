package Q3;

public class MultiplyThread extends Thread {
	Object lock;
	int start;
	int range;
	
	public MultiplyThread(Object lock, int start, int range) {
		super();
		this.lock = lock;
		this.start = start;
		this.range = range;
	}
	
	public void MultiplyNumbers(Object lock, int start, int range){
		
		synchronized (lock) {
			try {
				for(int i=start ; i<range ; i++) {
					Thread.sleep(10);
					System.out.println(getName()+" => " + i + "x" + i+"=" + (i*i));
					
					
					lock.wait();
					lock.notify();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	@Override
	public void run() {
		MultiplyNumbers(lock, start, range);
	}

}
