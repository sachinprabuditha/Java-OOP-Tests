package Question04;

public class Lunch extends Meal {

	@Override
	public void displayMeal() {
		System.out.println("\nPreparing Lunch......");
		mealWithFlour();
		mealInDuration();
		displayCost();

	}

	@Override
	public double displayCost() {
		System.out.println("Cost for the meal is = ");
		return 0;
	}

}
