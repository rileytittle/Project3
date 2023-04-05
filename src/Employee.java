
public class Employee extends Person
{
	private String employeeId;
	private String clockedIn;
	private String hiredDate;
	
	/**
	 * Constructor for Employee class
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param phoneNumber
	 * @param email
	 * @param employeeId
	 * @param clockedIn
	 * @param hiredDate
	 */
	public Employee(String firstName, String lastName, String address,
			        String phoneNumber, String email, String employeeId,
			        String clockedIn, String hiredDate)
	{
		super(firstName, lastName, address, phoneNumber, email);
		this.employeeId = employeeId;
		this.clockedIn = clockedIn;
		this.hiredDate = hiredDate;
	}//end Employee constructor
	
	@Override
	public String getFileData()
	{
		String data = employeeId + ",";
		data += super.getFileData();
		data += clockedIn + ",";
		return data;
	}
}//end class
