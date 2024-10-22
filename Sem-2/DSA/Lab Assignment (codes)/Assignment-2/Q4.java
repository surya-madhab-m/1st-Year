import java.util.*;

class deposit
{
	long principal;
	double rate;
	int time;
	double totalamt;
	deposit()
	{
		this.principal=2000;
		this.rate=12;
		this.time=2;
		 
	}
	deposit(long principal, int time, double rate)
	{
		this.principal=principal;
		this.rate=rate;
		this.time=time;
	}
	deposit(long principal, double rate)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter time:");
		int time=sc.nextInt();
		this.principal=principal;
		this.rate=rate;
		this.time=time;
		
	}
	deposit(long principal, int time)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rate:");
		double rate=sc.nextDouble();
		this.principal=principal;
		this.rate=rate;
		this.time=time;
	
	}
	void display()
	{
		System.out.println("principal="+principal+" "+"rate="+rate+" "+"time="+time);
	}
	double calamt()
	{
		double totalamt=principal+((principal*rate*time)/100); 
		return totalamt;
	}
}
public class Q4 
{

	public static void main(String[] args) 
	{
		deposit p1=new deposit();
		deposit p2=new deposit(20000,10);
		deposit p3=new deposit(10000, 4);
		deposit p4=new deposit(10000,10, 4);
		double a1=p1.calamt();
		double a2=p2.calamt();
		double a3=p3.calamt();
		double a4=p4.calamt();
		p1.display();
		System.out.println("Amount is "+a1);
		p2.display();
		System.out.println("Amount is "+a2);
		p3.display();
		System.out.println("Amount is "+a3);
		p4.display();
		System.out.println("Amount is "+a4);

	}

}
