package Ques02a;

public class CalcSum implements Runnable {
	
	private int total;

	public CalcSum() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<100000;i++) {
			total=total+i;
		}
		
		System.out.println("\nTotal: \n" + total + "\nThread: \n" + Thread.currentThread().getName());
		
	}

}
