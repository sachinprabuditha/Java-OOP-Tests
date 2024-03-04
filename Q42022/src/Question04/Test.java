package Question04;

public class Test {

	public static void main(String[] args) {
		
		Students poStudent = new PostGraduateStudents();
		poStudent.setFestival(new CodeFest());
		poStudent.setPrograms(new MScPrograms());
		poStudent.displayStudents();
		
		System.out.println();
		
		Students unStudents = new UndergraduateStudents();
		unStudents.setFestival(new RoboFest());
		unStudents.setPrograms(new BScPrograms());
		unStudents.displayStudents();

	}

}
