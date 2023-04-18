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
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param phoneNumber
	 * @param email
	 * @param employeeId
	 * @param clockedIn
	 * @param hiredDate
	 * @param certification
	 */
	public Tier2Employee(String firstName, String lastName, String address,
			             String phoneNumber, String email, String employeeId,
			             String clockedIn, String hiredDate, String certification) 
	{
		super(firstName, lastName, address, phoneNumber, email, employeeId, clockedIn, hiredDate);
		this.certification = certification;
	}//end Tier2Employee constructor
	
	@Override
	public String getFileData()
	{
		String data = super.getFileData();
		data += "," + certification;
		return data;
	}
}//end class
