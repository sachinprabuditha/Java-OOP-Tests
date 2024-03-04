package Ques04b;

public class GarageGateOpen implements Command {
	GarageGate garage;

	public GarageGateOpen(GarageGate garage) {
		super();
		this.garage = garage;
	}

	public GarageGateOpen() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garage.open();
	}

}
