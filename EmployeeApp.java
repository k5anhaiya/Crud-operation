import java.util.Scanner;

public class EmployeeApp 
{
	public static void main(String[] args) 
	{
		EmployeeController controller=new EmployeeController();
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("======================");
		System.out.println("1.Insert Record");
		System.out.println("2.Show All Record");
		System.out.println("3.Delete Record");
		System.out.println("4.Update Record");
		System.out.println("5.Search Record");
		System.out.println("6.Quit");
		System.out.println("======================");
		System.out.println("Enter your Choice:");
		int ch=sc.nextInt();
		if(ch==1)
		{
			controller.acceptEmployeeDetails();
		}
		if(ch==2)
		{
			controller.showList();
		}
		if(ch==6)
		{
			break;
		}
		}
		while(true);
	}

}
