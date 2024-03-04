package LabSheetGeneric;

public class bubbleSortMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,3,2,6,7,3,9,5,9,1};
		
		BubbleSort(arr);
		
		System.out.println("Sorted Array: ");
		for(int num : arr) {
			System.out.print(num + " ");
		}

	}



public static void BubbleSort(int arr[]) {
	// TODO Auto-generated constructor stub
	int n = arr.length;
	for (int i = 0 ; i < n-1 ; i++) {
		for(int j = 0 ; j < n-1-1 ; j++) {
			if (arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
}
}

