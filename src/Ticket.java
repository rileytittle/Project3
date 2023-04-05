
public class Ticket 
{
	private Customer customer;
	private String TicketCreatedAt;
	private String ticketId;
	
	/**
	 * Constructor for Ticket class
	 * @param customer
	 * @param TicketCreatedAt
	 * @param ticketId
	 */
	Ticket(Customer customer, String TicketCreatedAt, String ticketId)
	{
		this.customer = customer;
		this.TicketCreatedAt = TicketCreatedAt;
		this.ticketId = ticketId;
	}
	
	public String getFileData()
	{
		String data = customer.getFileData();
		data += ticketId + ",";
		data += TicketCreatedAt + ",";
		return data;
	}
}//end class
