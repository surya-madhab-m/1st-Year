import java.util.*;
public class Q1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no.s");
		System.out.print("Enter 1st no.");
		double x=sc.nextDouble();
		System.out.print("Enter 2nd no.");
		double y=sc.nextDouble();
		System.out.print("Enter an integer to find the square root:");
		int n=sc.nextInt();
		
		int add=additionSimple((int)x,(int)y);
		int sub=subtractionSimple((int)x,(int)y);
		int pro=multiplicationSimple((int)x,(int) y);
		double div= divisionSimple((int)(x),(int)y);
		int mod=remainderSimple((int)x,(int)y);
		double sqrt= squareRootSimple(n);
		System.out.println(add);
		System.out.println(sub);
		System.out.println(pro);
		System.out.println(div);
		System.out.println(mod);
		sc.close();
	}
	public static int additionSimple(int x, int y)
	{
		return(x+y);
	}
	public static int subtractionSimple(int x, int y)
	{
		return(x-y);
	}
	public static int multiplicationSimple(int x, int y)
	{
		return(x*y);
	}
	public static double divisionSimple(int x, int y)
	{
		double div=0.0;
		if (x==0)
		{
			System.out.println("Denominator cannot be 0");
		}
		else
		{
			div=(double)y/x;
		}
		return div;
	}
	public static int remainderSimple(int n, int m)
	{
		return(n%m);
	}
	public static double squareRootSimple(int n)
	{
		double sq=0.0;
		if (n>=0)
		{
			sq=Math.sqrt((double)n);
			
		}
		else
		{
			System.out.println("INVALID");
		}
		return(sq);
	}
	
		


		

		


}



