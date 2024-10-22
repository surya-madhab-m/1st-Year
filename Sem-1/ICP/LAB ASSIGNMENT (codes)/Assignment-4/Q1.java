import java.util.*;
public class Q1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter three no.");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		int s=0;
		for (int k=x; k<=y; k+=z)
		{
			System.out.print(k+" ");
			s+=k;
		}
		System.out.print("\n");
		System.out.println("The sum of the number displayed is: "+ s);
		
	}

}
