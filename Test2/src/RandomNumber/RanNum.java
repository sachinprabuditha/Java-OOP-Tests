package RandomNumber;

import java.util.Random;

public class RanNum {
	
	private int arr[][] = new int[5][5]; 

	public RanNum() {
		// TODO Auto-generated constructor stub
		Random ran = new Random();
		
		for (int i = 0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				arr[i][j] = ran.nextInt(100)+1;
			}
		}
	}
	
	public int minimum() {
		int min = arr[0][0];
		
		for(int i=0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				if(arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}
	
	public int maximum() {
		int max = arr[0][0];
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
	
	public double average() {
		int sum = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				sum = sum + arr[i][j];
			}
		}
		return (double) sum / 25;
	}
	
	public void displayValues() {
		System.out.println("Values: ");
		for(int i = 0; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Minimum: " + minimum());
		System.out.println("Maximum: " + maximum());
		System.out.println("Average: " + average());
		
	}
	
	

}
