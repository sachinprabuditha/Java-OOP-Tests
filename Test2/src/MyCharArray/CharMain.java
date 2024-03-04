package MyCharArray;

public class CharMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray = {'A','B','C','D','E'};
		CharArray charObj = new CharArray(charArray);
		
		System.out.println("Original Array: ");
		charObj.displayArray();
		charObj.displayString();
		
		charObj.swapFirstAndLast();
		
		System.out.println("\n\nArray after Swapping: ");
		charObj.displayArray();
		charObj.displayString();
	}
}
