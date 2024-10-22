import java.util.*;
public class Q8 
{

	public static void main(String[] args) 
	{
		double x,y;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter x coordinate: ");
		x=sc.nextDouble();
		System.out.print("Enter y coordinate: ");
		y=sc.nextDouble();
		
		if (x>0 && y>0)
		{
			System.out.println("("+x+","+y+")"+" is in quadrant I.");
	
		}
		else if (x<0 && y>0)
		{
			System.out.println("("+x+","+y+")"+" is in quadrant II.");
		}
		else if (x<0 && y<0)
		{
			System.out.println("("+x+","+y+")"+" is in quadrant III.");
		}
		else if (x>0 && y<0)
		{
			System.out.println("("+x+","+y+")"+" is in quadrant IV.");
		}
		else if (x==0 && y==0)
		{
			System.out.println("("+x+","+y+")"+" is on the origin.");
		}
		else if (x==0 && y!=0)
		{
			System.out.println("("+x+","+y+")"+" is on the y-axis.");
		}
		else if (y==0 && x!=0)
		{
			System.out.println("("+x+","+y+")"+" is on the x-axis.");
		}
		else
		{
			System.out.println("Error");
		}
		sc.close();
		
	}

}
