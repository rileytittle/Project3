import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class FileHandler 
{
	public void writeData(String workOrderFileName)
	{
		
	}
	
	public void readEmployeeData(String employeeFileName)
	{
		FileReader fileReader = null;
		System.out.println("Loading Employee Data");
		try 
		{
			fileReader = new FileReader("employee_data.csv");
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
		
	}
}
