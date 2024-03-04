package a2018;

public class Car extends Item{
	public String model;
	public String type;
	
	public Car(int itemNo, String description, double unitPrice, String model, String type) {
		super(itemNo, description, unitPrice);
		this.model = model;
		this.type = type;
	}

	@Override
	public void Display() {
		System.out.println("Item No: " + itemNo);
		System.out.println("Description: " + description);
		System.out.println("Unit Price: " + unitPrice);
		System.out.println("Model: " + model);
		System.out.println("Type: " + type);
	}

}
