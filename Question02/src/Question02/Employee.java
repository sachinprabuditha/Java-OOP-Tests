package Question02;

public class Employee<T> {
	private String name;
	private T empid;
	
	public Employee(String name, T empid) {
		super();
		this.name = name;
		this.empid = empid;
	}
	
	public T getEmpId() {
		return empid;
		
	}

}
