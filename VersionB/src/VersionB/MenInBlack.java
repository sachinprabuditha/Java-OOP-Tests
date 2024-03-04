package VersionB;

public class MenInBlack {
	
	int score;
	AlienPack ap;

	public MenInBlack(AlienPack a) {
		// TODO Auto-generated constructor stub
		ap = a;
		score = 0;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public AlienPack getAp() {
		return ap;
	}

	public void setAp(AlienPack ap) {
		this.ap = ap;
	}
	
	public void kill() {
		Alien arr[] = ap.getAliens();
		for(int i=0 ; i<arr.length ; i++) {
			this.score = this.score + arr[i].getScore();
		}
	}

}
