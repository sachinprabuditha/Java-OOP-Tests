package VersionB;

public class AlienPack {
	
	private Alien arr[];

	public AlienPack(int NoOfAliens) {
		// TODO Auto-generated constructor stub
		arr = new Alien[NoOfAliens];
	}
	
	public void addAlien(Alien a, int index) {
		arr[index] = a;
		
	}
	
	public Alien[] getAliens() {
		return arr;
		
	}

}
