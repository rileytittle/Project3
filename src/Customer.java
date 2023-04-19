/**
 * The Customer class is a person with a customer ID and an account number.
 * It extends Person and implements Printable.
 */
public class Customer extends Person implements Printable
{
	private String customerId;
	private String accountNumber;
	
	/**
	 * getCustomerId gets the customer's ID number
	 * @return the customer's ID number
	 */
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * setCustomerId sets the customer's ID number
	 * @param customerId the customer's ID number
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * getAccountNumber gets the customer's account number
	 * @return the customer's account number
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * setAccountNumber sets the customer's account number
	 * @param accountNumber the customer's account number
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Constructor for Customer class
	 * @param firstName the first name of the customer.
	 * @param lastName the last name of the customer.
	 * @param address the address of the customer.
	 * @param phoneNumber the phone number of the customer.
	 * @param email the email of the customer.
	 * @param customerId the customer's ID.
	 * @param accountNumber the customer's account number.
	 */
	Customer(String firstName, String lastName, String address,
			 String phoneNumber, String email, String customerId,
			 String accountNumber)
	{
		super(firstName, lastName, address, phoneNumber, email);
		setCustomerId(customerId);
		setAccountNumber(accountNumber);
	}//end Customer constructor
	/**
	 * getFileData returns a string with information about the Customer.
	 * @return a string with information about the customer.
	 */
	@Override
	public String getFileData()
	{
		String data = customerId + ",";
		data += super.getFileData();
		return data;
	}
}
