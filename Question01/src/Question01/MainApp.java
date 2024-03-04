package Question01;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<RegisteredCus> RegisteredCus = new ArrayList<>();
		RegisteredCus cus1 = new RegisteredCus(1, "Ann");
		RegisteredCus cus2 = new RegisteredCus(2, "Nimal");
		
		RegisteredCus.add(cus1);
		RegisteredCus.add(cus2);
		
		for (RegisteredCus customer : RegisteredCus) {
			customer.display();
            
            System.out.println();
		}
		

	}

}
