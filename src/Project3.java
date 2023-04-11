import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Queue;

/*
 * Author: Tittle, Riley
 * Course: COP3503
 * Project #: 3
 * Title: Input/Output
 * Due Date: 3/26/2023
 */
public class Project3 
{
	public static String employeeFileName = "employee_data.csv";
	public static String tier1TicketFileName = "tier1_ticket_data.csv";
	public static String tier2TicketFileName = "tier2_ticket_data.csv";
	public static String workOrderFileName = "workorder_data.csv";

	public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	public static Queue<Ticket> tier1TicketFile;
	public static Queue<Ticket> tier2TicketFile;
	public static ArrayList<WorkOrder> workOrderList = new ArrayList<WorkOrder>();

	public static void main(String[] args) 
	{
		System.out.println("Loading Employee Data");

		FileHandler.readEmployeeData(employeeFileName);

		System.out.println("Loading Ticket Data");

		tier1TicketFile = FileHandler.readTicketData(tier1TicketFileName);
		tier2TicketFile = FileHandler.readTicketData(tier2TicketFileName);

		System.out.println("Creating Work Orders");

		createWorkOrders();

		System.out.println("Writing Work Order Data to File");

		FileHandler.writeData(workOrderFileName);

		System.out.println("Work Orders created. Program Exiting");
	}//end main method

	public static void createWorkOrders()
	{

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date date = new Date();
		while(!(tier2TicketFile.isEmpty()))
		{
			for (Employee employee : employeeList) 
			{
				if((employee instanceof Tier2Employee) && (!tier1TicketFile.isEmpty()))
				{
					WorkOrder workOrder = new WorkOrder(employee, tier2TicketFile.remove(), dateFormat.format(date));
					workOrderList.add(workOrder);
				}
			}
		}
		while(!(tier1TicketFile.isEmpty()))
		{
			for (Employee employee : employeeList) 
			{
				if(!(employee instanceof Tier2Employee) && (!tier1TicketFile.isEmpty()))
				{
					WorkOrder workOrder = new WorkOrder(employee, tier1TicketFile.remove(), dateFormat.format(date));
					workOrderList.add(workOrder);
				}
			}
		}
		/*
		int employeeCounter = 0;
		for(int i = tier2TicketFile.size(); i >= 0; i--)
		{
			for(int j = employeeCounter; j < employeeList.size(); j++)
			{
				if(employeeList.get(j) instanceof Tier2Employee)
				{
					WorkOrder workOrder = new WorkOrder(employeeList.get(j), tier2TicketFile.remove(),
							dateFormat.format(date));
					workOrderList.add(workOrder);
					employeeCounter = j;
					employeeCounter++;
					break;
				}//end if
				employeeCounter = j;
			}//end inner for loop
			if(employeeCounter == employeeList.size())
			{
				employeeCounter = 0;
			}
		}//end outer for loop
		employeeCounter = 0;
		for(int i = tier1TicketFile.size(); i > 0; i--)
		{
			for(int j = employeeCounter; j < employeeList.size(); j++)
			{
				if(!(employeeList.get(j) instanceof Tier2Employee))
				{
					WorkOrder workOrder = new WorkOrder(employeeList.get(j), tier1TicketFile.remove(),
							dateFormat.format(date));
					workOrderList.add(workOrder);
					employeeCounter = j;
					employeeCounter++;
					break;
				}//end if
				employeeCounter = j;
			}//end inner for loop
			if(employeeCounter == employeeList.size())
			{
				employeeCounter = 0;
			}
		}//end outer for loop
		 */
	}
}//end class
