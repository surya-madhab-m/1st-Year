import java.util.*;
public class clq5 
{

	public static void main(String[] args) 
	{
		int min=0, max=0;
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		min=Math.min(a, b);
		int min1=Math.min(min, c);
		max=Math.max(b,c);
		int max1=Math.max(max, a);
		int t=(a+b+c)-(min1+max1);
		System.out.println(min1+","+t+","+max1);
		

	}

}
