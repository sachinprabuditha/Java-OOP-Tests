package Question04;

public class RoboFest implements IFestival {

	@Override
	public void performEvent() {
		System.out.println("Perform Robo Fest Event for " + getBudget());

	}

	@Override
	public double getBudget() {
		// TODO Auto-generated method stub
		return 800000.00;
	}

}
