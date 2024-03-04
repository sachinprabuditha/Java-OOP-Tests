package Ques04b;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileUI mb = new MobileUI();
		
		Oven oven = new Oven();
		
		GarageGate garageGate = new GarageGate();
		
		OvenOn onMainOven = new OvenOn(oven);
		OffOff offMainOven = new OffOff(oven);
		
		GarageGateOpen gateopen = new GarageGateOpen(garageGate);
		GarageGateClose gateclose = new GarageGateClose(garageGate);
		
		mb.setCommand(0, gateopen);
		mb.setCommand(1, gateclose);
		mb.setCommand(2, onMainOven);
		mb.setCommand(3, offMainOven);
		
		mb.commandPressed(2);
		mb.commandPressed(0);
		mb.commandPressed(3);
		mb.commandPressed(1);

	}

}
