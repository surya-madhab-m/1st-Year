import java.util.*;                     
public class Q3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x1,x2,x3;
		System.out.print("Input fisrt number:");
		x1=sc.nextInt();
		System.out.print("Input second number:");
		x2=sc.nextInt();
		System.out.print("Input third number:");
		x3=sc.nextInt();
		if (x1<x2 && x2<x3)
		{
				System.out.println("\"Increasing\"");
		}
		else if (x3<x2 && x2<x1)
		{
				System.out.println("\"Decreasing\"");
		}
		else
		{
			System.out.println("\"Neither increasing nor decreasing\"");
		}
		sc.close();
	}
}
