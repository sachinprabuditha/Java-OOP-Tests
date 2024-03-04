package VersionC;

import java.util.Random;

public class RandNum {
	
	int[][] arr = new int[5][5];

	public RandNum() {
		// TODO Auto-generated constructor stub
		Random r = new Random();
		int r1 = 100;
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				arr[i][j] = r.nextInt(r1);
			}
		}
		
	}
	
	void min() {
		int min = arr[1][1];
		int max = arr[1][1];
		int tot = 0;
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				System.out.print(arr[i][j] + " " );
				
				if(arr[i][j]<min) {
					min = arr[i][j];
				}
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
				tot = tot+arr[i][j];
			}
			System.out.println();
		}
		float avg = tot/25;
		System.out.println("Min: " + min + "\nMax: " + max + "\nAverage: " + avg );
		
	}

}
