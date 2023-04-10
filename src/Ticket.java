
public class Ticket implements Printable
{
	private Customer customer;
	private String ticketCreatedAt;
	private String ticketId;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getTicketCreatedAt() {
		return ticketCreatedAt;
	}

	public void setTicketCreatedAt(String ticketCreatedAt) {
		this.ticketCreatedAt = ticketCreatedAt;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	/**
	 * Constructor for Ticket class
	 * @param customer
	 * @param ticketCreatedAt
	 * @param ticketId
	 */
	Ticket(Customer customer, String ticketCreatedAt, String ticketId)
	{
		setCustomer(customer);
		setTicketCreatedAt(ticketCreatedAt);
		setTicketId(ticketId);
	}
	
	public String getFileData()
	{
		String data = customer.getFileData();
		data += ticketId + ",";
		data += ticketCreatedAt + ",";
		return data;
	}
}//end class
