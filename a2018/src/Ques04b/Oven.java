package Ques04b;

public class Oven {
	
	private String name;

	public Oven(String name) {
		super();
		this.name = name;
	}

	public Oven() {
		// TODO Auto-generated constructor stub
	}
	
	public void on() {
		System.out.println(name + " Oven is On");
	}
	
	public void off() {
		System.out.println(name + " Oven is off");
	}

}
