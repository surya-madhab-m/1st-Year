import java.util.*;
public class Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter a no.");
		x=sc.nextInt();
		int rev=0,r;
		int z=x;
		while (z!=0)
		{
			r=z%10;
			rev=rev*10+r;
			z=z/10;
		}
		int c=0;
		for (int i=2; i<=rev; i++)
		{
			if (rev%i==0)
			{
				c+=1;
			}
		}
		if (c==0)
		{
			System.out.println("It is a twisted prime");
		}
		else
		{
			System.out.println("Not a twisted prime");
		}
		sc.close();
	}

}
