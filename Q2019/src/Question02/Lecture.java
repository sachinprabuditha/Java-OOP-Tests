package Question02;

public class Lecture implements IPerson {
	
	String employeeID;
	String department;

	public Lecture(String employeeID, String department) {
		super();
		this.employeeID = employeeID;
		this.department = department;
	}

	@Override
	public String displayDetails() {
		String s = "EmployeeID: " + employeeID;
		return s;
	}

}
