package Question01;

public class SattelliteDemo {

	public static void main(String[] args) {
		ISattellite navigationalSatelite = new NavigationSatellite("Ravana-01");
		IGeoLocation locationTracker1 = new SattelliteLocation("Sri-Lanka");
		ISattellite droneSatelite = new DroneSattellite("Ravana-02");
		IGeoLocation locationTracker2 = new SattelliteLocation("Russia");
		
		ISattellite[] sateliteArray = new ISattellite[] {navigationalSatelite,droneSatelite};
		IGeoLocation[] igeoLocation = new IGeoLocation[] {locationTracker1,locationTracker2};
		
		SattelliteCenter sateliteCenter = new SattelliteCenter(0, sateliteArray, igeoLocation);
		sateliteCenter.startService();
		sateliteCenter.stopService();
		sateliteCenter.locationService();
		
		System.out.println();
		
		SattelliteCenter remoteController2 = new SattelliteCenter(1, sateliteArray, igeoLocation);
		remoteController2.startService();
		remoteController2.stopService();
		remoteController2.locationService();


	}

}
