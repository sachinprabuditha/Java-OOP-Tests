package Question04;

public abstract class Students {
	private IFestival festival;
	private IPrograms programs;
	
	public void setFestival(IFestival festival) {
		this.festival = festival;
	}
	public void setPrograms(IPrograms programs) {
		this.programs = programs;
	}
	public void conductEvent() {
		festival.performEvent();
	}
	public void offerPrograms() {
		programs.offerPrograms();
	}
	
	public abstract void displayStudents();
	
	public abstract void displayCost();
	

}
