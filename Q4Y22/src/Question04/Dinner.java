package Question04;

public class Dinner extends Meal {

	@Override
	public void displayMeal() {
		System.out.println("\nPreparing Dinner......");
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
