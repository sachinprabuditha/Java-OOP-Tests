package MyCharArray;

public class CharArray {
	private char myCharArray[];

	public CharArray(char charArray[]) {
		// TODO Auto-generated constructor stub
		myCharArray = charArray;
	}
	
	public void swapFirstAndLast() {
		if(myCharArray.length >= 2) {
			char temp = myCharArray[0];
			myCharArray[0] = myCharArray[myCharArray.length - 1];
			myCharArray[myCharArray.length - 1] = temp;
		}
	}
	
	public void displayArray() {
		for(char c : myCharArray) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	public void displayString() {
		String charString = new String(myCharArray);
		System.out.print(charString);
	}

}
