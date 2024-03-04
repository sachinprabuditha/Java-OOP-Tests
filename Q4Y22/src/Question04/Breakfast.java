package Question04;

public class Breakfast extends Meal {

	@Override
	public void displayMeal() {
		System.out.println("\nPreparing Breakfast......");
		mealWithFlour();
		mealInDuration();
		displayCost();

	}

	@Override
	public double displayCost() {
		System.out.println("Cost for the meal is =");
		return 0;
	}

}
