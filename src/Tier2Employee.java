
public class Tier2Employee extends Employee implements Printable
{
	private String certification;
	
	public String getCertification() {
		return certification;
	}

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
	
	/**
	 * Returns a string containing all the relevant data of a tier2employee object
	 * @return a string containing all the relevant data of a tier2employee object
	 */
	
	@Override
	public String getFileData()
	{
		String data = super.getFileData();
		data += "," + certification;
		return data;
	}
}//end class
