import java.util.*;
public class clq4 
{

	public static void main(String[] args) 
	{
		double t;
		t=Double.parseDouble(args[0]);
		double c=Math.cos(5*t);
		double s=Math.sin(7*t);
		double sum=c+s;
		System.out.println("cos(5t )+ sin (7t) = "+sum+" where t ="+t);

	}

}
