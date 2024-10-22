import java.util.*;
public class Q1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no: ");
		int n=sc.nextInt();
		int x=n;
		if (n<=2)
		{
			System.out.println("INVALID");
			
		}
		else
		{
			int count=0;
			while(n>=2)
			{
				n/=2;
				count+=1;
			}
			System.out.println("Number of times the number "+x+" is divided by 2 is "+count);
		}
		sc.close();

	}

}
