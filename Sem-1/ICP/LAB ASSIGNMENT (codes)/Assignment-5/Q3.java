import java.util.*;
public class Q3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("Enter first no.");
		x=sc.nextInt();
		System.out.println("Enter second no.");
		y=sc.nextInt();
		System.out.print("Prime numbers between "+x+" and "+y+" are ");
		for (int i=x; i<=y; i++)
		{
			int c=0;
			int j;
			for (j=2; j<i;j++)
			{
				if (i%j==0)
				{
					c+=1;
				}
			}
			if (c==0)
			{
				System.out.print(i+" ");
			}
		}
		sc.close();

	}

}
