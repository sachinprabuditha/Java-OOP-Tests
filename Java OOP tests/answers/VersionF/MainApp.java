package VersionF;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner; 



class  MyException extends Exception{
	
	MyException(){
		
		super();
		
		System.out.print("Invalid input" );	
		
	}	
}

class AlarmClock {
	
	public AlarmClock() {
		super();
	}

	private int Hour;
	private int Minute;
	private int Second;
	
	public AlarmClock(int hour, int minute, int second) {
		
		Hour = hour;
		Minute = minute;
		Second = second;
	}
	
	public void InputAlarm() throws MyException {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Enter hour : ");
			Hour = sc.nextInt();
			
			System.out.print("Enter Minute : ");
			Minute = sc.nextInt();
			
			System.out.print("Enter Second : ");
			Second = sc.nextInt();	
			if((Hour <0 || Hour >12) || (Minute < 0 ||  Minute > 59)|| (Second < 0 || Second > 59)) {
				throw new MyException();				
			}
			
			
		}catch(InputMismatchException e) {
			
			System.out.println("InputMismatchException");
			
		}
		
		
	}
	
	public void ShowAlarm() {
		System.out.println("\nHour :  " + Hour + "\nMinute : " + Minute + "\nSecond : " + Second);
	}
	
	public void SetAlarm(int hour, int minute, int second) {
		
		Hour = hour;
		Minute = minute;
		Second = second;			
		
	}

}


public class MainApp {

	public static void main(String[] args) throws MyException {
		AlarmClock ac1 = new AlarmClock();
		AlarmClock ac2 = new AlarmClock();		
		
		ac1.InputAlarm();
		ac2.InputAlarm();
		
		ArrayList<AlarmClock> arr = new ArrayList<AlarmClock>();
		
		arr.add(ac1);
		arr.add(ac2);
		
		for(AlarmClock i : arr) {
			i.ShowAlarm();
		}
		

	}

}