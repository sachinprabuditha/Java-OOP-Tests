package Question04;

import java.io.ObjectInputStream.GetField;

public class UndergraduateStudents extends Students {

	@Override
	public void displayStudents() {
			System.out.println("Display Under graduate students");
			offerPrograms();
			conductEvent();
			displayCost();

	}

	@Override
	public void displayCost() {
		System.out.println("Cost for postgraduate program is = ");

	}


}
