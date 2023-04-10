import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class FileHandler 
{
	private FileWriter loggerFile = null;
	private PrintWriter logPrinter = null;
	/**
	 * Constructor for FileHandler class
	 * Creates a FileHandler object and sets up the PrintWriter for the log
	 */
	public FileHandler() 
	{
		try 
		{
			loggerFile = new FileWriter("log.txt", true);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		logPrinter = new PrintWriter(loggerFile, true);
	}
	public void writeData(String workOrderFileName)
	{

	}
	/**
	 * readEmployeeData reads in the employee data from a csv file
	 * and creates tier1 or tier2 employees based on the data in the csv file. 
	 * The employee objects are added to the employeeList ArrayList in the Project3 class. 
	 * @param employeeFileName the name of file with the employee data
	 */
	public void readEmployeeData(String employeeFileName)
	{
		//update the log file
		logger("Loading Employee Data");
		//create a fileReader for the file
		FileReader fileReader = null;
		
		try 
		{
			//try to open the fileReader to to the csv file
			fileReader = new FileReader(employeeFileName);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}
		//Wrap the fileReader in a Scanner to get the employee data
		Scanner fileDataIn = new Scanner(fileReader);

		fileDataIn.nextLine(); //scan in the headers to ignore them
		
		//loop until there is no data left in file
		while(fileDataIn.hasNextLine())
		{
			//get a line of data from the csv file
			String employeeData = fileDataIn.nextLine();
			//split the line of data on the comma to parse it easily
			String[] employeeDataElements = employeeData.split(",");
			/**
			 * Constructor for Employee class
			 * @param firstName
			 * @param lastName
			 * @param address
			 * @param phoneNumber
			 * @param email
			 * @param employeeId
			 * @param clockedIn
			 * @param hiredDate
			 */
			String employeeId = employeeDataElements[0];
			String firstName = employeeDataElements[1];
			String lastName = employeeDataElements[2];
			String email = employeeDataElements[3];
			String address = employeeDataElements[4];
			String phoneNumber = employeeDataElements[5];
			String clockedIn = employeeDataElements[6];
			String dateHired = employeeDataElements[7];
			String tier = employeeDataElements[8];
			String certification = employeeDataElements[9];
			
			if(tier.equals("tier1"))
			{
				Employee employee = new Employee(firstName, lastName, address, phoneNumber, email, employeeId,
						clockedIn, dateHired);
				Project3.employeeList.add(employee);
			}
			else
			{
				Tier2Employee employee = new Tier2Employee(firstName, lastName, address, phoneNumber,
						email, employeeId, clockedIn, dateHired, certification);
				Project3.employeeList.add(employee);
			}//end else
		}//end while loop
		fileDataIn.close();
	}//end readEmployeeData method

	public LinkedList<Ticket> readTicketData(String ticketFileName)
	{
		logger("Loading Ticket Data");
		LinkedList<Ticket> ticketList = new LinkedList<>();
		FileReader fileReader = null;
		
		try 
		{
			fileReader = new FileReader(ticketFileName);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		Scanner fileScanner = new Scanner(fileReader);
		
		fileScanner.nextLine(); //get rid of the headers
		
		while(fileScanner.hasNextLine())
		{
			String ticketInfo = fileScanner.nextLine();
			String[] ticketInfoElements = ticketInfo.split(",");
			
			String customerId = ticketInfoElements[0];
			String firstName = ticketInfoElements[1];
			String lastName = ticketInfoElements[2];
			String email = ticketInfoElements[3];
			String address = ticketInfoElements[4];
			String phoneNumber = ticketInfoElements[5];
			String accountNumber = ticketInfoElements[6];
			String ticketId = ticketInfoElements[7];
			String createdAt = ticketInfoElements[8];
			/**
			 * Constructor for Ticket class
			 * @param customer
			 * @param ticketCreatedAt
			 * @param ticketId
			 */
			Customer customer = new Customer(firstName, lastName, address, phoneNumber, email, customerId, accountNumber);
			Ticket ticket = new Ticket(customer, createdAt, ticketId);
			ticketList.add(ticket);
		}
		fileScanner.close();
		return ticketList;
	}//end readTicketData method

	private void logger(String log)
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date date = new Date();
		logPrinter.println("log: " + dateFormat.format(date) + " : " + log);
	}
}
