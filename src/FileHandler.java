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
			
			if(employeeDataElements[8].equals("tier1"))
			{
				Employee employee = new Employee(employeeDataElements[1],
						employeeDataElements[2],
						employeeDataElements[4],
						employeeDataElements[5],
						employeeDataElements[3], 
						employeeDataElements[0],
						employeeDataElements[6],
						employeeDataElements[7]);
				Project3.employeeList.add(employee);
			}
			else
			{
				Tier2Employee employee = new Tier2Employee(employeeDataElements[1],
						employeeDataElements[2],
						employeeDataElements[4],
						employeeDataElements[5],
						employeeDataElements[3], 
						employeeDataElements[0],
						employeeDataElements[6],
						employeeDataElements[7],
						employeeDataElements[9]);
				Project3.employeeList.add(employee);
			}//end else
		}//end while loop
	}//end readEmployeeData method

	public LinkedList<Ticket> readTicketData(String ticketFileName)
	{
		LinkedList<Ticket> placeHolder = new LinkedList<>();
		return placeHolder;
	}

	private void logger(String log)
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date date = new Date();
		logPrinter.println("log: " + dateFormat.format(date) + " : " + log);
	}
}
