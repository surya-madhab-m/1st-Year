import java.util.*;
public class Q6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("Enter two no.");
		x=sc.nextInt();
		y=sc.nextInt();
		int z=x;
		int c=1;
		while (c<y)
		{
			x=x*z;
			c++;
		}
		System.out.println(z+" to the power "+y+" is "+x);
		sc.close();
	}

}
