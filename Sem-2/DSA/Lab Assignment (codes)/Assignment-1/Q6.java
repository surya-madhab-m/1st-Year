import java.util.*;
public class Q6 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a no.");
		int n=sc.nextInt();
		boolean ch=isOdd(n);
		if (ch)
		{
			System.out.println(n+" is odd.");
		}
		else
		{
			System.out.println(n+" is not odd.");
		}
		sc.close();

	}
	public static boolean isOdd(int n)
	{
		int x=n&1;
		if (x==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
