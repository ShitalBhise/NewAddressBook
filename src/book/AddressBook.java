package book;

public class AddressBook {

	private String fname;
	private String lname;
	private String city;
	private String state;
	private String zip;
	private String address;
	private String phoneNo;
	private String email;

	public AddressBook(String fname, String lname, String city, String state, String zip, String address,
			String phoneNo, String email) {
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	/*
	 * Use setters
	 */
	public void setfname(String fname) {
		this.fname = fname;
	}

	public void setlname(String lname) {
		this.lname = lname;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public void setstate(String state) {
		this.state = state;
	}

	public void setzip(String zip) {
		this.zip = zip;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public void setphoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setemail(String email) {
		this.email = email;
	}

	/*
	 * Use getters
	 */
	public String getfname() {
		return fname;
	}

	public String getlname() {
		return lname;
	}

	public String getcity() {
		return city;
	}

	public String getstate() {
		return state;
	}

	public String getzip() {
		return zip;
	}

	public String getaddress() {
		return address;
	}

	public String getphoneNo() {
		return phoneNo;
	}

	public String getemail() {
		return email;
	}

	@Override
	public String toString() {
		return "AddressBook [fname=" + fname + ", lname=" + lname + ", city=" + city + ", state=" + state + ", zip="
				+ zip + ", address=" + address + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}

	// public static void main(String[] args) {
	// System.out.println("Welcome to Address Book Program in Address Book");
}
