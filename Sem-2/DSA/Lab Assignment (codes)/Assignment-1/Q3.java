import java.util.*;

public class Q3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no: ");
		int n=sc.nextInt();
		int s=0, p=1;
		int x=n;
		while (n!=0)
		{
			int r=n%10;
			s+=r;
			p*=r;
			n/=10;
		}
		if (s==p)
		{
			System.out.println("So, "+x+" is a spy number.");
		}
		else
		{
			System.out.println("So, "+x+" is not a spy number.");
		}
		sc.close();

	}

}
