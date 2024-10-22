package pack1;
import java.util.*;
public class test extends student
{
	public int m1;     // wrote public because the class test is in default package, so we can't access the outside package directly
	public int m2;
	public void showdetials()
	{
		super.inputdetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mark1:");
		m1=sc.nextInt();
		System.out.println("Enter mark2:");
		m2=sc.nextInt();
		
	}
	public void showdetails()
	{
		super.showdetails();
		System.out.println("Mark1: "+m1+" "+"mark2: "+m2);
	}
}
