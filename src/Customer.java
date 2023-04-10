
public class Customer extends Person implements Printable
{
	private String customerId;
	private String accountNumber;
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Constructor for Customer class
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param phoneNumber
	 * @param email
	 * @param customerId
	 * @param accountNumber
	 */
	Customer(String firstName, String lastName, String address,
			 String phoneNumber, String email, String customerId,
			 String accountNumber)
	{
		super(firstName, lastName, address, phoneNumber, email);
		setCustomerId(customerId);
		setAccountNumber(accountNumber);
	}//end Customer constructor
	
	@Override
	public String getFileData()
	{
		String data = customerId;
		data += super.getFileData();
		return data;
	}
}
