
public class Employee {

	private String name;
	private int id;
	private static int empCount = 0;
	public Employee()
	{
		id = 0;
		name = "";
		empCount++;
	}
	
	public Employee(int newID, String newName)
	{
		setName(newName); 
		setID(newID);
		empCount++;
	}

	public int getCount()
	{
		return empCount;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String newName)
	{
		name = newName;
	}
	
	public int getID()
	{
		return id;
	}
	
	public void setID(int newID)
	{
		id = newID;
	}
	
	public String toString()
	{
		return ("Name: " + name + "\nID: " + id);
	}
	
}


