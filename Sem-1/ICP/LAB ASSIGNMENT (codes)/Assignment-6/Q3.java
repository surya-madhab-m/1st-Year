import java.util.Scanner;

public class Q3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter a no.");
		x=sc.nextInt();
		boolean ch=isPalindrome(x);
		System.out.println(ch);
		sc.close();
	}
	
	public static int reverse(int n)
	{
		int sum=0;
		
		while(n!=0)
		{
			int r=n%10;
			sum=sum*10+r;
 		    n/=10;
		}
		return(sum);
	}
	public static boolean isPalindrome(int d)
	{
		if (d==reverse(d))
		{
			return(true);
			
			
		}
		else
		{
			return(false);
		}
	}

}
