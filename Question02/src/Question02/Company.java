package Question02;

import java.util.HashMap;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Employee> empList = new HashMap<>();
		
		Employee<String> emp1 = new Employee<>("Nishan Perera","123456" );
		empList.put(1, emp1);
		
		Employee<Integer> emp2 = new Employee<>("Krishan Gamage", 12345);
		empList.put(2, emp2);
		
		for (int id: empList.keySet()) {
			Employee value = empList.get(id);
			System.out.println("Employee number: "+ id + " and the Employee ID is: " + value.getEmpId());
		}

	}

}
