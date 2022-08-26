import java.util.Scanner;

public class EmployeeController
{
	Scanner sc=new Scanner(System.in);
	EmployeeRepository repo=new EmployeeRepository();
	public void acceptEmployeeDetails()
	{
		System.out.println("------------------");
		System.out.print("Enter Employee id:");
		int eid=sc.nextInt();
		System.out.print("Enter Employee name:");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.print("Enter Employee department:");
		String department=sc.nextLine();
		System.out.println("Enter Employee salary:");
		int salary=sc.nextInt();
		Employee emp=new Employee(eid,name,department,salary);
		repo.addEmployee(emp);
		System.out.println("------------------");
	}
	public void showList()
	{
		repo.showEmployeeList();
	}
}
