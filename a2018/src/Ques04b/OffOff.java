package Ques04b;

public class OffOff implements Command {
	Oven oven;

	public OffOff(Oven oven) {
		super();
		this.oven = oven;
	}

	public OffOff() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		oven.off();
	}

}
