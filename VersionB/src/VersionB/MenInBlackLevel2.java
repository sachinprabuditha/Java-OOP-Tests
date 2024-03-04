package VersionB;
import java.util.Random;

public class MenInBlackLevel2 extends MenInBlack{

	public MenInBlackLevel2(AlienPack a) {
		// TODO Auto-generated constructor stub
		super(a);
		score = 0;
	}
	
	public void kill() {
		Alien[] arr = ap.getAliens();
		
		for(int i=0 ; i<arr.length ; i++) {
			Random rand = new Random();
			
			this.score = this.score + arr[i].getScore();
			
			if(rand.nextInt()%2==1) {
				this.score = this.score - 2;
			}
		}
	}

}
