package pack1;
import java.util.*;
public class student 
{
	String name;
	int roll;
	public void inputdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		name=sc.next();
		System.out.print("Enter rollno: ");
		roll=sc.nextInt();
		
	}
	public void showdetails()
	{
		System.out.println("Name: "+name+" "+"Rollno: "+roll);
	}

}
