/**
 * The Person class represents a person with their name, address, phone number, and email.
 */
public class Person implements Printable
{
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private String email;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Class Constructor
	 * @param firstName first name of the person 
	 * @param lastName last name of the person
	 * @param address the address of the person
	 * @param phoneNumber the phone number of the person
	 * @param email the email of the person
	 */
	public Person(String firstName, String lastName, 
			String address, String phoneNumber, String email) 
	{
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmail(email);
	}//end Person constructor
	
	/**
	 * Returns a string with information about the person
	 * @return a string with information about the person
	 */
	public String getFileData()
	{
		String data = "";
		data += firstName + ",";
		data += lastName + ",";
		return data;
	}
}//end class
