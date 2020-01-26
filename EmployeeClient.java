
public class EmployeeClient {

	public static void main(String[] args) 
	{
		int id;
		
		Employee emp_1 = new Employee();
		Employee emp_2 = new Employee(12345, "Tom Lee");
		
		System.out.println("\nEmployee #1\n" + emp_1);
		System.out .println("\nEmployee #2\n" + emp_2.toString());
		
		emp_1.setID(54321);
		emp_1.setName("Bruce Lee");
		
		System.out .println("\nEmployee #1 after setting data:\n" + emp_1 );
		
		id = emp_2.getID();
		
		System.out.println("\nEmployee #2: " + id);
		
		System.out.println("There are: "+ emp_1.getCount() + " employees.");

	}

}
