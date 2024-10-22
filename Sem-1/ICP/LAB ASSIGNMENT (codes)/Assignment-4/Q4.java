import java.util.*;
public class Q4
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("Enter two no.");
		x=sc.nextInt();
		y=sc.nextInt();
		int z;
		int c=1;
		if (x>y)
		{
			while (y!=0)
			{
				z=x%y;
				x=y;
				y=z;
				c++;
			}
		}
		System.out.println("GCD is: "+x);
		//else if (y>x)
		{
			while (y!=0)
			{
				z=x%y;
				x=y;
				y=z;
			}
	}

  }
}
