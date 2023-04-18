/**
 * The WorkOrder class represents a work order that has
 * an Employee assigned to it, a ticket associated
 * with it, and the date and time it was created.
 * It implements Printable.
 */
public class WorkOrder implements Printable
{
	private Employee employee;
	private Ticket ticket;
	private String createdAt;
	/**
	 * get Employee gets the employee object assigned the work order.
	 * @return the employee object who is assigned the work order.
	 */
	public Employee getEmployee() {
		return employee;
	}
	/**
	 * setEmployee sets the Employee who is to be assigned to this work order.
	 * @param employee the Employee who is to be assigned to this work order.
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	/**
	 * getTicket gets the ticket object associated with the work order.
	 * @return the ticket object associated with the work order.
	 */
	public Ticket getTicket() {
		return ticket;
	}
	/**
	 * setTicket sets the ticket object associated with the work order.
	 * @param ticket the ticket object associated with the work order.
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	/**
	 * getCreatedAt gets the date and time the work order was created at.
	 * @return the date and time the work order was created at.
	 */
	public String getCreatedAt() {
		return createdAt;
	}
	/**
	 * setCreatedAt sets the date and time the work order was created at.
	 * @param createdAt the date and time the work order was created at.
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * Constructor for WorkOrder class
	 * @param employee
	 * @param ticket
	 * @param createdAt
	 */
	public WorkOrder(Employee employee, Ticket ticket, String createdAt)
	{
		setEmployee(employee);
		setTicket(ticket);
		setCreatedAt(createdAt);
	}//end WorkOrder constructor
	
	@Override
	public String getFileData()
	{
		String data = ticket.getFileData();
		data += createdAt + ",";
		data += employee.getFileData();
		return data;
	}
}
