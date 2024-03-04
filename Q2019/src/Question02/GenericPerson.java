package Question02;

import java.util.ArrayList;

public class GenericPerson<T extends IPerson> {
	public void displayElements(ArrayList<T> obj) {
		
		for (T t : obj) {
			System.out.println(t.displayDetails());
		}
		
	}

}
