public class clq1 
{

	public static void main(String[] args)
	{
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double r=a%b;
		double q=a/b; 
		System.out.println("Remainder is "+r);
        System.out.println("Quotient is "+q);
	}

}