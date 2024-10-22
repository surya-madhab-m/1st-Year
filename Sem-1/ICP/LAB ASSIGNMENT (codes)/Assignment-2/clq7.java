import java.util.*;
public class clq7 
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		boolean check=((a<=(b*c))||(b<=(c*a))||(c<=(a*b)));
		System.out.println(check);
	}

}
