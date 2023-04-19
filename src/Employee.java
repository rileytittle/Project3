/**
 * The Employee class is a Person with an Employee ID, a clocked in time, and a hired date.
 * It extends Person and implements Printable
 */
public class Employee extends Person implements Printable
{
	private String employeeId;
	private String clockedIn;
	private String hiredDate;
	/**
	 * getEmployeeId gets the employee's ID number
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}
	/**
	 * setEmployeeId sets the employee's ID number
	 * @param employeeId the employee's ID number
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * getClockedIn gets the date and time the employee clocked in.
	 * @return the date and time the employee clocked in. 
	 */
	public String getClockedIn() {
		return clockedIn;
	}
	/**
	 * setClockedIn sets the date and time the employee clocked in.
	 * @param clockedIn the date and time the employee clocked in. 
	 */
	public void setClockedIn(String clockedIn) {
		this.clockedIn = clockedIn;
	}
	/**
	 * getHiredDate gets the date the employee was hired.
	 * @return the date the employee was hired
	 */
	public String getHiredDate() {
		return hiredDate;
	}
	/**
	 * setHiredDate sets the date the employee was hired.
	 * @param hiredDate the date the employee was hired
	 */
	public void setHiredDate(String hiredDate) {
		this.hiredDate = hiredDate;
	}

	/**
	 * Constructor for Employee class
	 * @param firstName the first name of the employee.
	 * @param lastName the last name of the employee.
	 * @param address the address of the employee.
	 * @param phoneNumber the phone number of the employee.
	 * @param email the email of the employee.
	 * @param employeeId the employee's ID number.
	 * @param clockedIn the time the employee clocked in.
	 * @param hiredDate the date the employee was hired.
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
	/**
	 * getFileData returns a string with information about the Employee.
	 * @return a string with information about the Employee.
	 */
	@Override
	public String getFileData()
	{
		String data = employeeId + ",";
		data += super.getFileData();
		data += clockedIn;
		return data;
	}
}//end class
