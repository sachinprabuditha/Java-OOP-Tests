package Question03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter Pattern 1 = ");
		String pattern1 = sc.next();
		
		System.out.println("Enter Pattern 2 = ");
		String pattern2 = sc.next();
		
		System.out.println("Enetr Count = ");
		int count = sc.nextInt();
		
		Object lock = new Object();
		
		Pattern01 patternThread1 = new Pattern01(lock, pattern1, count);
        Pattern02 patternThread2 = new Pattern02(lock, pattern2, count);

        patternThread1.start();
        patternThread2.start();
        
        try {
			patternThread1.join();
			patternThread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
	}

}
