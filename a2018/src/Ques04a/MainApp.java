package Ques04a;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard cd1 = new CreditCard();
		CreditCard cd2 = new CreditCard();
		
		System.out.println(cd1.validate("2345678923546783", 234));
		System.out.println(cd2.validate("2846392304739236", 567));
		
		System.out.println(cd1.equals(cd2));

	}

}
