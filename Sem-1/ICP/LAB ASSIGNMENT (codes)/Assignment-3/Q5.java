import java.util.Scanner;

public class Q5 
{

	public static void main(String[] args) 
	{
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the year: ");
		y=sc.nextInt();
		if (y%4==0)
		{
			if (y%100==0)
			{
				if (y%400==0)
				{
					System.out.println(y+" is a leap year");
					
				}
				else
				{
					System.out.println(y+ " is not a leap year");
				}
			}
			else
			{
				System.out.println(y+" is a leap year");
			}
		}
		else
		{
			System.out.println(y+ " is not a leap year");
			
		}
		sc.close();
		

	}

}
