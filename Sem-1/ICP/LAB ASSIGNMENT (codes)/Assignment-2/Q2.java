import java.util.*;
public class Q2 
{

	public static void main(String[] args) 
	{
		Double d;
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER DISTANCE(in km): ");
		d=sc.nextDouble();
		System.out.println(d+"km is "+(d*1000)+" m");
		System.out.println(d+"km is "+(d*3280.8399)+"feet");
		System.out.println(d+"km is "+(d*39370.0787)+"inch");
		System.out.println(d+"km is "+(d*100000)+"cm");
		sc.close();
		
	

	}

}
