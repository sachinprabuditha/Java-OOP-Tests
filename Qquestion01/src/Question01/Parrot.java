package Question01;

public class Parrot extends Pet {
	
	private String cammand;

	public Parrot(String cammand) {
		super();
		this.cammand = cammand;
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		super.feed();
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		super.clean();
	}

	@Override
	public void cuddle() {
		// TODO Auto-generated method stub
		super.cuddle();
	}
	
	public boolean isCaught() {
		if(cammand.equals("Walk")) {
		try {	
			throw new CaughtException("CaughtException: Caught");	
		}
		catch (CaughtException e) {
			e.printStackTrace();
			setPoints(0);
			return true;
		}
		}
		
		else {
			System.out.println("Did Not Caught");
			return false;
		}
	
	
	}
}
