import java.util.*;
public class Q5 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter a no.");
		x=sc.nextInt();
		int s=0;
		for (int i=1; i<x; i++)
		{
			if (x%i==0)
			{
				s+=i;
			}
		}
		if (s==x)
		{
			System.out.print(x+" is a perfect number");
		}
		else
		{
			System.out.print(x+" is not a perfect number");
		}
		sc.close();
	}

}
