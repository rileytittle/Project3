
public class Customer extends Person
{
	private String customerId;
	private String accountNumber;
	
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
		this.customerId = customerId;
		this.accountNumber = accountNumber;
	}//end Customer constructor
	
	@Override
	public String getFileData()
	{
		String data = customerId;
		data += super.getFileData();
		return data;
	}
}
