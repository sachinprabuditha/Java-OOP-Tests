package Question04;

public class ChicketFlavour implements IPreapareDeliciously {

	@Override
	public void addFlavour() {
		System.out.println("Added Chicken for the meal");

	}

	@Override
	public double getCost() {
		return 100.00;
	}

}
