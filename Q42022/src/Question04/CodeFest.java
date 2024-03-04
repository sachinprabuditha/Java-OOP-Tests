package Question04;

public class CodeFest implements IFestival {

	@Override
	public void performEvent() {
		System.out.println("Perform CodeFest Fest Event for " + getBudget());

	}

	@Override
	public double getBudget() {
		// TODO Auto-generated method stub
		return 3000000.00;
	}

}
