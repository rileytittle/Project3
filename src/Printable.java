/**
 * Printable interface has getFileData method that 
 * should return all the relevant data about an object
 * in a comma-separated format
 */
public interface Printable 
{
	/**
	 * the getFileData method will return a string containing
	 * pertinent information about the object on which it is being
	 * called in csv format. 
	 * @return a string with information about the object.
	 */
	String getFileData();
}//end interface
