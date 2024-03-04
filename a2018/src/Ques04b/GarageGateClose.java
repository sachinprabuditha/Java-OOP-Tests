package Ques04b;

public class GarageGateClose implements Command {
	
	GarageGate garage;

	public GarageGateClose(GarageGate garage) {
		super();
		this.garage = garage;
	}

	public GarageGateClose() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garage.close();
		
	}

}
