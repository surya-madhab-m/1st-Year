import java.util.*;
public class Q6 
{

	public static void main(String[] args) 
	{
		int u;
		double c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the unit: ");
		u=sc.nextInt();
		if (u<=50)
		
		{
			c=u*3;
			System.out.println("Montly electric bill is Rs."+c);
		}
		else if (u>50 && u<=200)
		{
			c=(50*3)+((u-50)*4.80);
			System.out.println("Montly electric bill is Rs."+c);
		}
		else if (u>200 && u<=400)
		{
			c=(50*3)+(150*4.80)+((u-200)*5.80);
			
			System.out.println("Montly electric bill is Rs."+c);
		}
		else if (u>400)
		{
			c=(50*3)+(150*4.80)+(200*5.80)+((u-400)*6.20);
			System.out.println("Montly electric bill is Rs."+c);
		}
		else
		{
			System.out.println("Invalid input, should be an integer and greater than 0");
		}
		sc.close();
	}

}
