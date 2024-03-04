package Question01;

public class SattelliteCenter {
	private int option;
	private ISattellite[] iSattellite;
	private IGeoLocation[] iGeoLocation;
	
	public SattelliteCenter(int option, ISattellite[] iSattellite, IGeoLocation[] iGeoLocation) {
		super();
		this.option = option;
		this.iSattellite = iSattellite;
		this.iGeoLocation = iGeoLocation;
	}
	public void startService() {
		switch (option) {
		case 0: {
			iSattellite[0].activate();
		}
		case 1: {
			iSattellite[1].activate();
		}
	
		}
	}
	
	public void stopService() {
		switch (option) {
		case 0: {
			iSattellite[0].deactivate();
		}
		case 1: {
			iSattellite[1].deactivate();
		}
		
		}
	}
	
	public void locationService() {
		switch (option) {
		case 0: {
			iGeoLocation[0].displayLocation();
		}
		case 1: {
			iGeoLocation[1].displayLocation();
		}
		
		}
	}

}
