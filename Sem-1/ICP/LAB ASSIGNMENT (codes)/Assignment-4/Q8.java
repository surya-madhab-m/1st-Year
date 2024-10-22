import java.util.*;
public class Q8 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x, r1;
		do
		{
			r1=(int)(Math.random()*(10-1+1))+1;
			System.out.println("Enter User guess:");
			x=sc.nextInt();
			System.out.println("Computer guess: "+r1);
			System.out.println("User guess is: "+x);
			if (x>r1)
			{
				System.out.println("Too high, try again");
			
			}
			else if (x<r1)
			{
				System.out.println("Too low, try again");
			}
			else
			{
				System.out.println("Good guess");
			}
			
		}while (r1!=x);
		
		
		
	}

}
