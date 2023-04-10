import java.util.ArrayList;
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
		
		
		
	}//end main method
	
	public static void createWorkOrders()
	{
		
	}
}//end class
