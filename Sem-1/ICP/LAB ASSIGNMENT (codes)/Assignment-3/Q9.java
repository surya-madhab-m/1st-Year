import java.util.*;
public class Q9 
{

	public static void main(String[] args) 
	{
		int x,y,z;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter three no.s");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if (x>y && x>z)
		{
			System.out.println(x+" is the largest no.");
			if (y>z)
			{
				
				System.out.println(y+" is the second largest no.");
			}
			else
			{
				System.out.println(z+" is the second largest no.");
				
			}
		}
		else if (y>x && y>z)
		{
			System.out.println(y+" is the largest no.");
			if (x>z)
			{
				
				System.out.println(x+" is the second largest no.");
			}
			else
			{
				System.out.println(z+" is the second largest no.");
			}
		}
		else if (z>x && z>y)
		{
			System.out.println(z+" is the largest no.");
			if (x>y)
			{
				System.out.println(x+" is the second largest no.");
			}
			else
			{
				System.out.println(y+" is the second largest no.");
			}
		}
		else
		{
			System.out.println("All are equal no.s");
		}
		sc.close();

	}

}
