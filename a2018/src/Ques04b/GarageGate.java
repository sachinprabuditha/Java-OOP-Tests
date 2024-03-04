package Ques04b;

public class GarageGate {
	
	private String description;

	public GarageGate(String description) {
		super();
		this.description = description;
	}

	public GarageGate() {
		// TODO Auto-generated constructor stub
	}
	
	public void open() {
		System.out.println(description + " Open Now");
	}
	
	public void close() {
		System.out.println(description + " Close Now");
	}

}
