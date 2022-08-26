import java.util.ArrayList;

public class EmployeeRepository 
{
	private ArrayList<Employee> list=new ArrayList<Employee>();
	public void addEmployee(Employee emp)
	{
		list.add(emp);
		System.out.println("------------------------");
		System.out.println("Employee record added");
		System.out.println("------------------------");
	}
	public void showEmployeeList()
	{
		System.out.println("------------------------");
		for(Employee emp:list)
		{
			System.out.println(emp);
		}
		System.out.println("------------------------");
	}

}
