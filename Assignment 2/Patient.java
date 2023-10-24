package patient;

public class Patient {
	private String firstName, middleName,lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyName, emergencyNumber;
	
	Patient(){
		
		
	}
	Patient(String firstName, String middleName, String lastName){
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	Patient(String firstName, String middleName,String lastName, String streetAddress, String city, String state,String zipCode,String phoneNumber,String emergencyName,String emergencyNumber){
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state  = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emergencyName = emergencyName;
		this.emergencyNumber = emergencyNumber;
		
		}
	
	public String getfirstName() {
		return this.firstName;
	}
	public String getmiddleName() {
		return this.middleName;
	}
	public String getlastName() {
		return this.lastName;
	}
	public String getstreetAddress() {
		return this.streetAddress;
	}
	public String getCity() {
		return this.city;
	}
	public String getstate() {
		return this.state;
	}
	public String getzipCode() {
		return this.zipCode;
	}
	public String getphoneNumber() {
		return this.phoneNumber;
	}
	public String getemergencyName() {
		return this.emergencyName;
	}
	public String getemergencyNumber() {
		return this.emergencyNumber;
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setmiddleName(String middleName) {
		 this.middleName = middleName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public void setstreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setstate(String state) {
		this.state = state;
	}
	public void setzipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setemergencyName(String emergencyName) {
		 this.emergencyName = emergencyName;
	}
	public void setemergencyNumber(String emergencyNumber) {
		 this.emergencyNumber = emergencyNumber;
	}

	public String buildFullName() {
		return this.firstName+" "+this.middleName+" "+this.lastName;
	}
	public String buildAddress() {
		return this.streetAddress+" "+this.city+" "+this.state+" "+this.zipCode;
	}
	public String buildEmergencyContact () {
		return this.emergencyName+" "+this.emergencyNumber;
	}
	public void printOut() {
		
		System.out.println("Patient Info:\n"+"Name: "+buildFullName()+"\n"+"Address: "+buildAddress()+"\n"+"Emergency Contact: "+buildEmergencyContact ()+"\n");
	}







}
