package Lab3;

public class Student {
	private String name, ditno, address;

	public Student(String name, String ditno, String overriding) {
		this.name = name;
		this.ditno = ditno;
		this.address = overriding;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDitno() {
		return ditno;
	}

	public void setDitno(String ditno) {
		this.ditno = ditno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
