
public class Ticket 
{
	private Customer customer;
	private String createdAt;
	private String ticketId;
	
	/**
	 * Constructor for Ticket class
	 * @param customer
	 * @param createdAt
	 * @param ticketId
	 */
	Ticket(Customer customer, String createdAt, String ticketId)
	{
		this.customer = customer;
		this.createdAt = createdAt;
		this.ticketId = ticketId;
	}
	
	public String getFileData()
	{
		String data = customer.getFileData();
		data += ticketId + ",";
		data += createdAt + ",";
		return data;
	}
}//end class
