import java.util.*;
public class Q10 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter a no.");
		x=sc.nextInt();
		int z=x;
		int p=1;
		int c=0;
		while (p<=z)
		{
			p=p*3;
			c++;
			
		}
		p=p/3;
		c--;
		System.out.println("Largest power of 3 less than or equal to "+x+" is "+c);

	}

}
