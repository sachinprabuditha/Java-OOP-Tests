package Lottery;

public class LotteryMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lottery lot = new Lottery();
		
		int userPicks[] = {2,4,5,3,2};
		int matchingDigits = lot.compareWithUserPicks(userPicks);
		
		System.out.println("\nLottery Numbers: ");
		
		for(int number : lot.lotteryNumbers) {
			System.out.print(number);
		}
		
		System.out.println("\nUser Numbers: ");
		for(int number : userPicks) {
			System.out.print(number);
		}
		
		System.out.print("\nNumber of Matching digits: " + matchingDigits);

}
}
