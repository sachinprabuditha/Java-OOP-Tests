package Question04;

public class GameFest implements IFestival {

	@Override
	public void performEvent() {
		System.out.println("Perform Game Fest Event for " + getBudget());

	}

	@Override
	public double getBudget() {
		// TODO Auto-generated method stub
		return 400000.00;
	}

}
