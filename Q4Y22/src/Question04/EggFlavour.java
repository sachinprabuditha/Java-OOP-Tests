package Question04;

public class EggFlavour implements IPreapareDeliciously {

	@Override
	public void addFlavour() {
		System.out.println("Added egg for the meal");

	}

	@Override
	public double getCost() {
		return 60.00;
	}

}
