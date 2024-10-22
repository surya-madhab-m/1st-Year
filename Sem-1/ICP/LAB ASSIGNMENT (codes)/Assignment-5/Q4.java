import java.util.*;
public class Q4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of m : ");
		int m=sc.nextInt();
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();
		if (m>0 && n>0 && m<n)
		{
			for(int i=m; i<=n; i++)
			{
				int fact=1;
				for(int j=1; j<=i; j++)
				{
					fact*=j;
				}
				System.out.println("Factorial of "+i+" is "+fact);
			}
		}
		sc.close();
	}

}
