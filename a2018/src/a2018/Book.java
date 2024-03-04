package a2018;

public class Book extends Item{
	
	public String publisher;
	public String category;
	public int pages;

	public Book(int itemNo, String description, double unitPrice, String publisher, String category, int pages) {
		super(itemNo, description, unitPrice);
		this.publisher = publisher;
		this.category = category;
		this.pages = pages;
	}

	@Override
	public void Display() {
		System.out.println("Item No: " + itemNo);
		System.out.println("Description: " + description);
		System.out.println("Unit Price: " + unitPrice);
		System.out.println("Publisher: " + publisher);
		System.out.println("Category: " + category);
		System.out.println("Pages: " + pages);
	}
	
	

	

}
