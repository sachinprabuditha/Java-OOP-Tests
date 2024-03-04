package Question04;

public abstract class Meal {
	
	private IPrepareQuickly Duration;
	private IPreapareDeliciously Flavour;
	
	
	public void setDuration(IPrepareQuickly duration) {
		Duration = duration;
	}
	public void setFlavour(IPreapareDeliciously flavour) {
		Flavour = flavour;
	}
	public void mealInDuration() {
		Duration.deliveryTime();
	}
	public void mealWithFlour() {
		Flavour.addFlavour();
	}
	
	public abstract void displayMeal();
	
	public abstract double displayCost();
	
	
}
