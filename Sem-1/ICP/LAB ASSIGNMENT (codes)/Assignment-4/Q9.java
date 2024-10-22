import java.util.*;
public class Q9 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter a no.");
		x=sc.nextInt();
		int p=1, s=0, r;
		while (x!=0)
		{
			r=x%10;
			if (r!=0)
			{
				s=s+(r*p);
				p*=10;
			}
			x=x/10;
		}
		System.out.println(s);
		sc.close();
	}

}
