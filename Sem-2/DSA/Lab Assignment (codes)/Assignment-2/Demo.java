import java.util.*;
class commission
{
	double p;
	commission(double p)
	{
		this.p=p;
	}
	double getcommission()
	{
		if (p <100)
		{
			return ((2.0/100)*p);
		}
		else if (p>=100 && p<5000)
		{
			return(0.05*p);
		}
		else
		{
			return(0.08*p);
		}
	}
}
public class Demo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the price:");
		double p=sc.nextDouble();
		if (p<0)
		{
			System.out.println("INVALID");
			
		}
		else
		{
			commission c1=new commission(p);
			double sales=c1.getcommission();
			System.out.println("Commission of this sales "+p+" is "+sales);
		}
		
		
	}

}
