import java.util.*;
public class Q5 
{

	public static void main(String[] args) 
	{
		double s;
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the side:");
		s=sc.nextDouble();
		System.out.print("Enter the number of sides:");
		x=sc.nextInt();
		double res=area(x,s);
		System.out.println(res);

	}
	public static double area(int n, double side)
	{
		return ((n*side*side)/(4*Math.tan(Math.PI/n)));
		
		
	}

}
