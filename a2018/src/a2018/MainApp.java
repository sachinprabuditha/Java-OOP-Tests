package a2018;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Item> itemlist = new ArrayList<Item>();
		
		Item book1 = new Book(1, "Boook1", 260.00, "Gunasena", "Children", 56);
		Item book2 = new Book(2, "Boook2", 760.00, "Gunasena", "Children", 06);
		
		itemlist.add(book1);
		itemlist.add(book2);
		
		Item car1 = new Car(1, "Car1", 2600000.00, "BMW", "M3");
		Item car2 = new Car(2, "Car2", 7600000.00, "Honda", "Civic");
		
		itemlist.add(book1);
		itemlist.add(book2);
		
		for (Item item : itemlist) {
			item.Display();
		}
	}

}
