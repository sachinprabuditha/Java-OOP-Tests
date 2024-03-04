package Ques04b;

public class OvenOn implements Command {
	
	Oven oven;

	public OvenOn(Oven oven) {
		super();
		this.oven = oven;
	}

	public OvenOn() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		oven.on();
		
	}

}
