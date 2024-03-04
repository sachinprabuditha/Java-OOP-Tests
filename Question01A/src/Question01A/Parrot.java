package Question01A;

public class Parrot extends Pet{
	private String command;

	public Parrot(String command) {
		this.command = command;
	}

	
	@Override
	public void GetTotalPoints() {
		// TODO Auto-generated method stub
		super.GetTotalPoints();
	}




	public boolean isCaught() {
		if(command.equals("Walk")) {
			try {
				throw new CaughtException("CaughtException : Caught");
			}
			catch(CaughtException e) {
				System.out.println(e.getMessage());
				setPoints(0);
				return true;
			}
		}
		else {
			System.out.println("Did not Caught");
			return false;
		}
		
	}

}
