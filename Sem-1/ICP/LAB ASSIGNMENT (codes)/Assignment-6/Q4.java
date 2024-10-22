
public class Q4 
{

	public static void main(String[] args) 
	{
		
		for(int i=2000; i<=2020;i++)
		{
			int ch=numberOfDaysInAYear(i);
			System.out.println(i+" has "+ch+" days.");
		}
		

	}
	public static int numberOfDaysInAYear(int y)
	{
		if (y%4==0)
		{
			if (y%100==0)
			{
				if (y%400==0)
				{
					return 366;
					
				}
				else
				{
					return 365;
				}
			}
			else
			{
				return 366;
			}
		}
		else
		{
			return 365;
			
		}
		
	}

}
