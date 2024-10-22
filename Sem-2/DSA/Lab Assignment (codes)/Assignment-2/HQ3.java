import java.util.*;
class bank
{
	String bname;
	double damt;
	static double tamt=0;
	void setbname(String bname)
	{
		this.bname=bname;
		
	}
	void setamt(double dmt)
	{
		this.damt=damt;
	}
	void showdata()
	{
		System.out.println(bname+" "+damt);
	}
}

public class HQ3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		bank b[]=new bank[5];
		for (int i=0; i<b.length; i++)
		{
			System.out.println("Enter bank name, deposit amount "+(i+1));
			String bname=sc.next();
			double damt=sc.nextDouble();
			bank.tamt+=damt;
			b[i]=new bank();
			b[i].setbname(bname);
			b[i].setamt(damt);
		}
		for (int i=0; i<b.length; i++)
		{
			b[i].showdata();
		}
		double min=b[0].damt;
		int x=0;
		for (int i=1; i<b.length; i++)
		{
			if (b[i].damt<min)
			{
				x=i;
			}
		}
		System.out.println("bank details with minimun deposit is: ");
		System.out.println(b[x].bname+" "+b[x].damt+" "+b[x].tamt);
	}

}
