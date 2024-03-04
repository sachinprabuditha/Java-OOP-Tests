package VersionA;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lottery1 {
	int userNo[] = new int[5];
	int lotNo[] = new int[5];
	ArrayList<Integer> a2 = new ArrayList<>();

	public Lottery1() {
		// TODO Auto-generated constructor stub
		Random rd = new Random();
		
		for(int i=0 ; i < 5 ; i++) {
			lotNo[i] = rd.nextInt(9);
		}
		
	}
	public void userNo(){
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<5 ; i++) {
			int y = i+1;
			System.out.println("Enter Number " + y + ": ");
			userNo[i] = sc.nextInt();
			
		}
	}
	public void Match() {
		int j=0;
		
		   for(int i=0 ; i <5 ; i++) {
			   if(lotNo[i]==userNo[i]) {
				   j++;
				   a2.add(lotNo[i]);
			   }
		   }
		   
		   System.out.println("\nUser Numbers: ");
		   for(int i=0 ; i<5 ; i++) {
			   System.out.println(userNo[i] + "\t");
		   }
		   
		   System.out.println("\nLotterynNumbers: ");
		   for(int i=0 ; i<5 ; i++) {
			   System.out.println(lotNo[i] + "\t");
		   }
		   
		   System.out.println("\nNumber of Matching Digits: " + j);
		   
		   System.out.println("Matching Digits: ");
		   for (Integer integer : a2) {
			   System.out.println(integer);
			
		}
		   
		
		
	}
	

}
