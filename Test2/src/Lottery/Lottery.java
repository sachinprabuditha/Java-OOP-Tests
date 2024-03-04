package Lottery;

import java.util.Random;

public class Lottery {
	int lotteryNumbers[];
	

	public Lottery() {
		// TODO Auto-generated constructor stub
		lotteryNumbers = new int[5];
		Random random = new Random();
		
		for (int i=0 ; i < 5 ; i++) {
			lotteryNumbers[i] = random.nextInt(10);
		}
		
	}
	
	public int compareWithUserPicks(int userPicks[]) {
		int matchingDigits = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			if(lotteryNumbers[i] == userPicks[i]) {
				matchingDigits++;
			}
		}
		return matchingDigits;
	}
}
