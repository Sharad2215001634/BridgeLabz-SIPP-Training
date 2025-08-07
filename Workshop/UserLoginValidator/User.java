package Workshop.UserLoginValidator;
class User {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String password;
	private int age;
	private int pincode;
	
	public User(String firstName,String lastName,String phoneNumber,String email,String password,int age,int pincode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.age = age;
		this.pincode = pincode;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public int getAge() {
		return age;
	}
	public int getPincode() {
		return pincode;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
