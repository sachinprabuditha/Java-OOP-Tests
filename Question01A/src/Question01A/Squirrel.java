package Question01A;

public class Squirrel extends Pet{
	private String command;

	public Squirrel(String command) {
		this.command = command;
	}

	public boolean isCaught() {
		if(command.equals("Run5")) {
			try {
				throw new CaughtException("CaughtException: Caught");
			}
			catch(CaughtException e) {
				System.out.println(e.getMessage());
				setPoints(0);
				return true;
			}
		}
		else {
			System.out.println("Did not caught");
			return false;
		}
		
	}

}
