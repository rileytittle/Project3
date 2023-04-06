
public class Person implements Printable
{
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private String email;

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
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
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
