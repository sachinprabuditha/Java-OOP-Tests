package Ques02a;

public class MainThreadApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread countdown = new CountDown();
		
		Thread Black = new Thread(new CalcSum());
		Thread White = new Thread(new CalcSum());
		
		countdown.start();
		
		countdown.join();
		
		Black.setName("Black");
		White.setName("White");
		
		Black.start();
		White.start();
		

	}

}
