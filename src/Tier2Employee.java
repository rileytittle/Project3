/**
 * The Tier2Employee Class is an Employee with a certification. 
 * It extends Employee and implements Printable. 
 */
public class Tier2Employee extends Employee implements Printable
{
	private String certification;
	/**
	 * getCertification gets the certification that the Tier2Employee has.
	 * @return the certification that the Tier2Employee has.
	 */
	public String getCertification() {
		return certification;
	}
	/**
	 * setCertification sets the certification that the Tier2Employee has.
	 * @param certification a certification that the Tier2Employee has.
	 */
	public void setCertification(String certification) {
		this.certification = certification;
	}

	/**
	 * Constructor for Tier2Employee class
	 * @param firstName the first name of the employee
	 * @param lastName the last name of the employee
	 * @param address the address of the employee
	 * @param phoneNumber the phone number of the employee
	 * @param email the email of the employee
	 * @param employeeId the employee's ID number
	 * @param clockedIn the time the employee clocked in
	 * @param hiredDate the date the employee was hired
	 * @param certification the certification the employee holds
	 */
	public Tier2Employee(String firstName, String lastName, String address,
			             String phoneNumber, String email, String employeeId,
			             String clockedIn, String hiredDate, String certification) 
	{
		super(firstName, lastName, address, phoneNumber, email, employeeId, clockedIn, hiredDate);
		this.certification = certification;
	}//end Tier2Employee constructor
	/**
	 * getFileData returns a string with information about the Tier2Employee.
	 * @return a string with information about the Tier2Employee.
	 */
	@Override
	public String getFileData()
	{
		String data = super.getFileData();
		data += "," + certification;
		return data;
	}
}//end class
