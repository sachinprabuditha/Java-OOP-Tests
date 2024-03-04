package Question01;

public class NavigationSatellite implements ISattellite {
	private String name;

	public NavigationSatellite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		System.out.println(name + " navigational satallite activate");

	}

	@Override
	public void deactivate() {
		// TODO Auto-generated method stub
		System.out.println(name + " navigational satallite deactivate");

	}

}
