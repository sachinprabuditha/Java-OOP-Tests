package Ques02a;

public class CountDown extends Thread{
	
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			System.out.print(i);
			
			try {
				CountDown.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
