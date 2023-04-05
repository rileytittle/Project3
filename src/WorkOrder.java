public class WorkOrder 
{
	private Employee employee;
	private Ticket ticket;
	private String WorkOrderCreatedAt;
	
	/**
	 * Constructor for WorkOrder class
	 * @param employee
	 * @param ticket
	 * @param WorkOrderCreatedAt
	 */
	public WorkOrder(Employee employee, Ticket ticket, String WorkOrderCreatedAt)
	{
		this.employee = employee;
		this.ticket = ticket;
		this.WorkOrderCreatedAt = WorkOrderCreatedAt;
	}//end WorkOrder constructor
	
	public String getFileData()
	{
		String data = ticket.getFileData();
		data += WorkOrderCreatedAt + ",";
		data += employee.getFileData();
		return "";
	}
}
