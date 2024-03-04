package Question01;

public class DroneSattellite implements ISattellite {
	private String name;

	public DroneSattellite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		System.out.println(name + " navigational drone activate");

	}

	@Override
	public void deactivate() {
		// TODO Auto-generated method stub
		System.out.println(name + " navigational Drone deactivate");

	}

}
