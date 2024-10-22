import java.util.*;
public class Q8 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();
		int s=0;
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=i; j++)
			{
				s+=j;
			}
		}
		System.out.println(s);
		sc.close();

	}

}
