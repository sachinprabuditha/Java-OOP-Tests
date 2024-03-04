package a2018;

public abstract class Item {
	public int itemNo;
	public String description;
	public double unitPrice;
	
	public Item(int itemNo, String description, double unitPrice) {
		super();
		this.itemNo = itemNo;
		this.description = description;
		this.unitPrice = unitPrice;
	}
	
	public void Display() {
		System.out.println("Item No: " + itemNo);
		System.out.println("Description: " + description);
		System.out.println("Unit Price: " + unitPrice);
	}


}
