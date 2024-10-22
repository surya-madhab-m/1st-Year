import java.util.*;
public class Q4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter our number: ");
		int n= sc.nextInt();
		int min=1,max=9;
		Random r=new Random();
		System.out.print("Computer guesses: ");
		int r1=r.nextInt(max-min)+min;
		System.out.println(r1);
		if (n==r1)
		{
			System.out.println("You got it right");
		}
		else if (n==(r1+1)||n==(r1-1))
		{
			System.out.println("You almost got it");
		}
		else
		{
			System.out.println("You got it wrong");
		}
		sc.close();		

	}

}
