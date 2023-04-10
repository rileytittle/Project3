import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Author: Tittle, Riley
 * Course: COP3503
 * Project #: 2
 * Title: Input/Output
 * Due Date: 3/26/2023
 */
public class Project3 
{
	public static String employeeFileName = "employee_data.csv";
	public static String tier1TicketFileName = "tier1_ticket_data.csv";
	public static String tier2TicketFileName = "tier2_ticket_data.csv";
	public static String workOrderFileName;
	
	public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	public static Queue<Ticket> tier1TicketFile;
	public static Queue<Ticket> tier2TicketFile;
	public static ArrayList<WorkOrder> workOrderList = new ArrayList<WorkOrder>();
	
	public static void main(String[] args) 
	{
		FileHandler fileHandler = new FileHandler();
		
		System.out.println("Loading Employee Data");
		
		fileHandler.readEmployeeData(employeeFileName);
		
		System.out.println("Loading Ticket Data");
		
		tier1TicketFile = fileHandler.readTicketData(tier1TicketFileName);
		tier2TicketFile = fileHandler.readTicketData(tier2TicketFileName);
		
		System.out.println("Creating Work Orders");
		
		createWorkOrders();
		
		for(int i = 0; i < workOrderList.size(); i++)
		{
			System.out.println(workOrderList.get(i).getFileData());
		}
	}//end main method
	
	public static void createWorkOrders()
	{
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date date = new Date();
		
		int employeeCounter = 0;
		for(int i = tier2TicketFile.size(); i > 0; i--)
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
	}
}//end class
