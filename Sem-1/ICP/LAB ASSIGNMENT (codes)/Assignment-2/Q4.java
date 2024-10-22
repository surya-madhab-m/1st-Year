import java.util.*;
public class Q4 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. (between 1 to 1000) ");
		n=sc.nextInt();
		int s;
		s=0;
		int y=n%10;
		s+=y;
		int n1=n/10;
		int z=n%10;
		s+=z;
		int n2=n1/10;
		int a=n1%10;
		s+=a;
		System.out.println(s);
		sc.close();
		
		
				
		
		

	}

}
