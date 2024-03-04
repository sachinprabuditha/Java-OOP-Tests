package Question04;

public class PostGraduateStudents extends Students {

	@Override
	public void displayStudents() {
		System.out.println("Display Post graduate students");
		offerPrograms();
		conductEvent();
		displayCost();

	}

	@Override
	public void displayCost() {
		System.out.println("Cost for postgraduate program is = "  );

	}

}
