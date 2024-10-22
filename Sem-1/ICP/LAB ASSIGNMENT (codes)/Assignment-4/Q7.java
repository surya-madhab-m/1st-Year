import java.util.*;
public class Q7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter a no. for which you want to find the multiplication table:");
		x=sc.nextInt();
		int c=1;
		while (c<=10)
		{
			int p=x*c;
			System.out.println(x+" * "+c+" = "+p);
			c++;
		}
		sc.close();

	}

}
