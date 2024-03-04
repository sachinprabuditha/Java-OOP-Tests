package Question01;

public class Squirrel extends Pet {
	private String command;

	public Squirrel(String command) {
		super();
		this.command = command;
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
		if(command.equals("Run5")) {
			try {
				throw new CaughtException("CaughtException: Caught");
			} catch (CaughtException e) {
			   e.printStackTrace();
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
