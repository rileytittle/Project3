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
	/**
	 * getFirstName gets the Person's first name
	 * @return the person's first name
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * setFirstName sets the Person's first name
	 * @param firstName the name to assign to the person's first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * getLastName gets the Person's last name
	 * @return the person's last name
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * setLastName sets the Person's last name
	 * @param lastName the name to assign to the person's last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * getAddress gets the Person's address
	 * @return the person's address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * setAddress sets the Person's address
	 * @param address the address of the Person
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * getPhoneNumber gets the Person's Phone Number
	 * @return the person's Phone Number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * setPhoneNumber sets the Person's Phone Number
	 * @param phoneNumber the Phone Number of the Person
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * getEmail gets the Person's Email
	 * @return the person's Email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * setEmail sets the Person's Email
	 * @param email the Email of the Person
	 */
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
	 * getFileData returns a string with information about the person
	 * @return a string with information about the person
	 */
	@Override
	public String getFileData()
	{
		String data = "";
		data += firstName + ",";
		data += lastName + ",";
		return data;
	}
}//end class
