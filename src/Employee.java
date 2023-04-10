
public class Employee extends Person implements Printable
{
	private String employeeId;
	private String clockedIn;
	private String hiredDate;
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getClockedIn() {
		return clockedIn;
	}

	public void setClockedIn(String clockedIn) {
		this.clockedIn = clockedIn;
	}

	public String getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(String hiredDate) {
		this.hiredDate = hiredDate;
	}

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
		setEmployeeId(employeeId);
		setClockedIn(clockedIn);
		setHiredDate(hiredDate);
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
