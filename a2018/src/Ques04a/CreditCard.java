package Ques04a;

public class CreditCard {
	
	private static CreditCard creditcard;
		
	public static CreditCard getInstance() {
		if(creditcard == null) {
			creditcard = new CreditCard();
		}
		
		return creditcard;
		
	}
	
	public boolean validate(String cardno, int code){
		if(cardno.length() == 16 && code % 3 == 0) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

	
}
