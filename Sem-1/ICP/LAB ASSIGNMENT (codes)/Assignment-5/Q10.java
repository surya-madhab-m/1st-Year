import java.util.*;
public class Q10
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter a no.");
		x=sc.nextInt();
		int a=0, b=1, c=1, next;
		int count=4;
		if (x<=3)
		{
			System.out.print("Should be greater than 3");
		}
		else
		{
			System.out.print(a+"  "+b+"  "+c);
			while (count<=x)
			{
				next=a+b+c;
				System.out.print("  "+next);
				a=b;
				b=c;
				c=next;
				count+=1;
				
			}
		}
		
		
		sc.close();
	}

}
