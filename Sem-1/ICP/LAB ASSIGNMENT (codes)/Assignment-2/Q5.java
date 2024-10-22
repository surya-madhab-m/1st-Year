import java.util.*;
public class Q5 
{

	public static void main(String[] args)
	{
		Double r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		r=sc.nextDouble();
		Double pi=3.14;
		Double v=(2.0/3)*pi*r*r*r;
		Double sa=3*pi*r*r;
		System.out.println("The Surface area of hemisphere is "+sa);
		System.out.println("The volume of the hemisphere is "+v);
		sc.close();

	}

}
