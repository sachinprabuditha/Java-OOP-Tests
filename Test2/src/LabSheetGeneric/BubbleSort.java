package LabSheetGeneric;


public class BubbleSort<T extends Comparable<T>> {

	public static void main(String[] args) {
		Integer[] intArray = {5,6,4,3,2,6,7,8,5,1};
		String[] stringArray = {"Apple", "Banana", "Sachin", "Prabuditha"};
		
		bubbleSort(intArray);
		bubbleSort(stringArray);
		
		System.out.println("Sorted Integer Array: ");
		for(Integer num : intArray) {
			System.out.println(num + " ");
		}
		
		System.out.println("\nSorted String Array: ");
		for(String str : stringArray) {
			System.out.println(str + " ");
		}
	}

	private static <T extends Comparable <T>> void bubbleSort(T[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for (int i = 0 ; i < n - 1 ; i++) {
			for(int j = 0; j < n - i - 1 ; j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

	

}
