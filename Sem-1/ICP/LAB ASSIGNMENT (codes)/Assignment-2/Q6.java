import java.util.*;
public class Q6 
{
	public static void main(String[] args)
	{
		final double g=32.174;
		double t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time (in sec): ");
		t=sc.nextDouble();
		Double d=(1.0/2)*g*t*t;
		System.out.println("Distance travelled is: "+d);
		sc.close();

	}

}
