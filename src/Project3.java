/*
 * Author: Tittle, Riley
 * Course: COP3503
 * Project #: 3
 * Title: Objects and Classes
 * Due Date: 4/21/2023
 * 
 * The program reads data in from three csv files. One contains data
 * about employees, one contains data about tier 1 tickets, and one 
 * contains data about tier 2 tickets. The program will create multiple objects
 * from user-defined classes with the end goal of creating work orders for each ticket.
 * The work orders are then written out to a csv file. 
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Queue;

/**
 * Project3 class has the main method for the program. The class
 * has multiple public static variables that are used in other classes. 
 * The program has multiple method calls to methods defined in the 
 * FileHandler class. 
 * The class also has a method that creates work orders based on the data read in
 * by the FileHandler class.
 */
public class Project3 
{
	/**
	 * employeeFileName is a string that holds the name of the file 
	 * with the employee data
	 */
	public static String employeeFileName = "employee_data.csv";
	/**
	 * tier1TicketFileName is a string that holds the name of the file
	 * with the tier1 ticket data
	 */
	public static String tier1TicketFileName = "tier1_ticket_data.csv";
	/**
	 * tier2TicketFileName is a string that holds the name of the file
	 * with the tier2 ticket data
	 */
	public static String tier2TicketFileName = "tier2_ticket_data.csv";
	/**
	 * workOrderFileName is a string that holds the name of the file
	 * that the program is writing work orders out to
	 */
	public static String workOrderFileName = "workorder_data.csv";
	/**
	 * employeeList is an ArrayList that holds employee objects 
	 */
	public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	/**
	 * tier1TicketFile is a Queue that holds tier1 ticket objects
	 */
	public static Queue<Ticket> tier1TicketFile;
	/**
	 * tier2TicketFile is a Queue that holds tier2 ticket objects
	 */
	public static Queue<Ticket> tier2TicketFile;
	/**
	 * workOrderList is an ArrayList that holds workOrder objects to be written
	 * out to the workorder_data.csv file.
	 */
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

	/**
	 * createWorkOrders create workOrder objects using the employee objects and 
	 * ticket objects in employeeList, tier2TicketFile, and tier1TicketFile.
	 */
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
		
	}//end createWorkOrders
}//end class
