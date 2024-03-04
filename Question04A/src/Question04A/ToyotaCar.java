package Question04A;

public class ToyotaCar implements Car {
	private CarAirBag carAirBag;

	public ToyotaCar(CarAirBag carAirBag) {
		super();
		this.carAirBag = carAirBag;
	}

	@Override
	public void assembleLight() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for Toyota");
		carAirBag.airBagLightIndicator();
		
	}

	@Override
	public void assembleMotionSensor() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for Toyota");
		carAirBag.airBagMotionDetection();
	}

}
