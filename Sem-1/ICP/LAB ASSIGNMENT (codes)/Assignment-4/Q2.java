import java.util.*;
public class Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter a no.");
		n=sc.nextInt();
		int k=Math.abs(n);
		int s=0;
		while(n!=0)
		{
			int r=(n%10);
			n=n/10;
			s+=r;
		}
		if (s%9==0)
		{
			System.out.println(k+" is divisible by 9");
		}
		else
		{
			System.out.println(k+" is not divisible by 9");
		}

	}

}
