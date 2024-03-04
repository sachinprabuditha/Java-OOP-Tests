package Question04A;

public class NissanCar implements Car {
	private CarAirBag carAirBag;

	public NissanCar(CarAirBag carAirBag) {
		super();
		this.carAirBag = carAirBag;
	}

	@Override
	public void assembleLight() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for Nissan");
		carAirBag.airBagLightIndicator();
		
	}

	@Override
	public void assembleMotionSensor() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for Nissan");
		carAirBag.airBagMotionDetection();
	}

}
