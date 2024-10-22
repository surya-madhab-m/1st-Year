import java.util.*;
public class Q9 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();
		int count=1;
		double sum=0;
		while (count<=n)
		{
			sum+=(double)(1.0/Math.pow(count++, 2));
			//count+=1;
			
		}
		System.out.println(sum);
		sc.close();

	}

}
