package Question04A;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarAirBag fairbag = new FrontAirBag();
		CarAirBag sairbag = new SideAirBag();
		
		new NissanCar(fairbag).assembleLight();
		new NissanCar(fairbag).assembleMotionSensor();
		new NissanCar(sairbag).assembleMotionSensor();
		
		new ToyotaCar(fairbag).assembleLight();
		new ToyotaCar(fairbag).assembleMotionSensor();
		new ToyotaCar(sairbag).assembleLight();
		new ToyotaCar(sairbag).assembleMotionSensor();

	}

}
