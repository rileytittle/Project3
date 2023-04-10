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
	public void writeData(String workOrderFileName)
	{

	}

	public void readEmployeeData(String employeeFileName)
	{
		logger("Loading Employee Data");
		FileReader fileReader = null;
		System.out.println("Loading Employee Data");
		try 
		{
			fileReader = new FileReader(employeeFileName);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}
		Scanner fileDataIn = new Scanner(fileReader);

		fileDataIn.nextLine(); //scan in the headers to ignore them

		while(fileDataIn.hasNextLine())
		{
			String employeeData = fileDataIn.nextLine();
			String[] employeeDataElements = employeeData.split(",");
			if(employeeDataElements[9].equals(null))
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
			}
		}
	}

	public LinkedList<Ticket> readTicketData(String ticketFileName)
	{
		LinkedList<Ticket> placeHolder = new LinkedList<>();
		return placeHolder;
	}

	private void logger(String log)
	{
		FileWriter loggerFile = null;
		try 
		{
			loggerFile = new FileWriter("log.txt");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		PrintWriter logPrinter = new PrintWriter(loggerFile, true);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date date = new Date();
		logPrinter.println("log: " + date + " : " + log);
	}
}
