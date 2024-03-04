package VersionA;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
	int UserNo[] = new int[5];
	int lotNo[] = new int[5];
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	Random rd = new Random();

	public Lottery() {
		// TODO Auto-generated constructor stub
		for(int i=0 ; i<5 ; i++) {
			lotNo[i] =  rd.nextInt(9);
		}
	}
	public void UserNo() {
		Scanner Sc = new Scanner(System.in);
		
		for(int i = 0 ; i<5 ; i++) {
			int y = i+1;
			System.out.print("Enter Number " + y + ":");
			UserNo[i] = Sc.nextInt();
		}
	}
	
	public void Match() {
		
		int j = 0;
		
			for(int i = 0; i<5 ; i++) {
				if(lotNo[i] == UserNo[i]) {
					j++;
					al.add(lotNo[i]);
				}
			}
			
			System.out.print("\nUser's Numbers: ");
			
			for(int i=0 ; i<5 ; i++) {
				System.out.print(UserNo[i] + "\t");
			}
			
			System.out.print("\nLottery Number: ");
			
			for(int i=0 ; i<5 ; i++) {
				System.out.print(lotNo[i] + "\t");
			}
			
			System.out.print("\nNumber of matching digits: " + j);
			
			System.out.print("\nMatching Digits: ");
			
			for(Integer x: al) {
				System.out.println(x);
			}
			
			
	}

}
