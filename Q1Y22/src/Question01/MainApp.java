package Question01;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<RegisteredCus> RegisteredCus = new ArrayList<RegisteredCus>();
		
		RegisteredCus Cus1 = new RegisteredCus(101, "Kamal");
		RegisteredCus Cus2 = new RegisteredCus(101, "Kamal");
		
		RegisteredCus.add(Cus1);
		RegisteredCus.add(Cus2);
		
		for (RegisteredCus customer : RegisteredCus) {
			customer.display();
			customer.calculateBill();
		}
	}

}
