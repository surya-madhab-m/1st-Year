import java.util.Scanner;

interface detailinfo
{
	void display();
	int count();
}

class person20 implements detailinfo
{
	static int maxcount;
	String name;
	public int count()
	{
		return name.length();
	}
	public void display()
	{
		System.out.println("Name: "+name+" "+"Count: "+count());
	}
}
public class Q7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		person20 p[]=new person20[3];
		for (int i=0; i<p.length; i++)
		{
			p[i]=new person20();
			p[i].name=sc.next();
			p[i].count();
			
		}
		for (int i=0; i<p.length; i++)
		{
			p[i].display();
		}
		int maxcount=p[0].count();
		int x=0;
		for (int i=1; i<p.length; i++)
		{
			if (p[i].count()>maxcount)
			{
				maxcount=p[i].count();
				x=i;
			}
		}
		System.out.println("max is "+maxcount);
		


	}
}
