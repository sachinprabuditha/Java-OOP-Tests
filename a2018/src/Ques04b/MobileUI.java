package Ques04b;

public class MobileUI {
	
	Command Command[];
	

	public MobileUI() {
		Command = new Command[6];
		
		for(int i=0 ; i<6 ; i++) {
			Command[i]=null;
		}
		
	}

	public void setCommand(int index, Command cmdobj) {
		Command[index] = cmdobj;
	}
	
	public void commandPressed(int index) {
		Command[index].execute();
	}


}
