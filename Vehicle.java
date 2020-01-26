
public class Vehicle {

	private int id;
	private String model;

	public Vehicle(){}

	public void setID(int id)
	{
		this.id = id;
	}

	public int getID()
	{
		return id;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public String getModel()
	{
		return model;
	}

	public String toString()
	{
		return "ID: " + id + "\nModel: " + model;
	}

}






