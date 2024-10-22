import pack1.*;
import pack2.*; //or import pack.sports;
public class Q8 
{

	public static void main(String[] args) 
	{
		test t1=new test();
		t1.inputdetails();
		t1.showdetails();
		int total=t1.m1+t1.m2+sports.score1+sports.score2;
		System.out.println("Score obtained is "+total);
		
		     

	}

}
