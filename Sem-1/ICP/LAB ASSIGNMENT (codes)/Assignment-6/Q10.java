import java.util.*;
public class Q10 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("To find area of recatangle:");
		System.out.print("Enter length:");
		double l=sc.nextDouble();
		System.out.print("Enter breadth:");
		double b=sc.nextDouble();
		System.out.print("To find area of square:");
		System.out.print("Enter length:");
		double n=sc.nextDouble();
		System.out.print("To find area of CIRCLE:");
		System.out.print("Enter radius:");
		double r=sc.nextDouble();
		System.out.print("To find area of TRIANGLE:");
		System.out.print("Enter height:");
		int h=sc.nextInt();
		System.out.print("Enter base:");
		int bs=sc.nextInt();
		double rec=area(l,b);
		double sq=area(n);
		double cir=area(r);
		double tri=area(bs,h);
		System.out.print("area of recatangle is:"+rec);
		System.out.print("area of square is:"+sq);
		System.out.print("To find area of CIRCLE:"+cir);
		System.out.print("To find area of TRIANGLE:"+tri);
	}
	public static double area(double x, double y)
	{
		return(x*y);
	}
	public static double area(double m)
	{
		return(m*m);
	}
	public static double area(double y)
	{
		return(Math.PI*y*y);
	}
	public static double area(int  p, int q)
	{
		return(0.5*p*q);
	}
	
		
		
		
		
		
		
		
		
	}


