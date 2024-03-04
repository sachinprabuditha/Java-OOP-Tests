package VersionD;

public class CharArray {
	
	char myCharArray[];

	public CharArray(char[] myCharArray) {
		// TODO Auto-generated constructor stub
		super();
		this.myCharArray = myCharArray;
	}
	
	void swapFirstAndLast() {
		char x = myCharArray[0];
		char y = myCharArray[myCharArray.length-1];
		myCharArray[0] = y;
		myCharArray[myCharArray.length-1] = x;
	}

	
}
