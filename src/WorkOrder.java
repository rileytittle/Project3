public class WorkOrder implements Printable
{
	private Employee employee;
	private Ticket ticket;
	private String workOrderCreatedAt;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public String getWorkOrderCreatedAt() {
		return workOrderCreatedAt;
	}

	public void setWorkOrderCreatedAt(String workOrderCreatedAt) {
		this.workOrderCreatedAt = workOrderCreatedAt;
	}

	/**
	 * Constructor for WorkOrder class
	 * @param employee
	 * @param ticket
	 * @param workOrderCreatedAt
	 */
	public WorkOrder(Employee employee, Ticket ticket, String workOrderCreatedAt)
	{
		this.employee = employee;
		this.ticket = ticket;
		this.workOrderCreatedAt = workOrderCreatedAt;
	}//end WorkOrder constructor
	
	public String getFileData()
	{
		String data = ticket.getFileData();
		data += workOrderCreatedAt + ",";
		data += employee.getFileData();
		return "";
	}
}
