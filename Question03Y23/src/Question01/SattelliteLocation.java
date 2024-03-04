package Question01;

public class SattelliteLocation implements IGeoLocation {
	private String loction;
	
	

	public SattelliteLocation(String loction) {
		super();
		this.loction = loction;
	}



	@Override
	public void displayLocation() {
		// TODO Auto-generated method stub
		System.out.println("Sattelite Loction is = " + this.loction);

	}

}
