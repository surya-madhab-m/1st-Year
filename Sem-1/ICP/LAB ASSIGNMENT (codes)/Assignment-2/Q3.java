import java.util.*;
public class Q3 
{

	public static void main(String[] args) 
	{
		double sal;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter basic salary (in Rs.) ");
		sal=sc.nextDouble();
		double da=0.4*sal;
		double hra=0.2*sal;
		double gs=sal+da+hra;
		System.out.println("DA is "+da);
		System.out.println("HRA is "+hra);
		System.out.println("Gross salary is "+gs);
		sc.close();
		
		
	}

}
