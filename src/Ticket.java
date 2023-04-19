/**
 * The Ticket class represents a work ticket with it's customer, the time it
 * was created at, and it's own unique ID.
 */
public class Ticket implements Printable
{
	private Customer customer;
	private String createdAt;
	private String ticketId;
	/**
	 * getCustomer gets the Customer object associated with the Ticket
	 * @return the Customer object associated with the Ticket
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * setCustomer sets the local Customer object.
	 * @param customer the customer that is associated with the ticket.
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * getCreatedAt will get the time and date the ticket was created at.
	 * @return the time and date the ticket was created at.
	 */
	public String getCreatedAt() {
		return createdAt;
	}
	/**
	 * setCreatedAt will set the date and time the ticket was created at.
	 * @param ticketCreatedAt the date and time the ticket was created at. 
	 */
	public void setCreatedAt(String ticketCreatedAt) {
		this.createdAt = ticketCreatedAt;
	}
	/**
	 * getTicketId gets the ticket ID.
	 * @return the ticket ID.
	 */
	public String getTicketId() {
		return ticketId;
	}
	/**
	 * setTicketId sets the ticket ID.
	 * @param ticketId the ticket ID.
	 */
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	/**
	 * Constructor for Ticket class
	 * @param customer the customer associated with the ticket.
	 * @param ticketCreatedAt the date and time the ticket was created at.
	 * @param ticketId the ID number of the ticket.
	 */
	Ticket(Customer customer, String ticketCreatedAt, String ticketId)
	{
		setCustomer(customer);
		setCreatedAt(ticketCreatedAt);
		setTicketId(ticketId);
	}
	/**
	 * getFileData returns a string with information about the Ticket.
	 * @return a string with information about the Ticket.
	 */
	@Override
	public String getFileData()
	{
		String data = customer.getFileData();
		data += ticketId + ",";
		data += createdAt + ",";
		return data;
	}
}//end class
