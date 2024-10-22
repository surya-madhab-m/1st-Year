import java.util.*;
class book
{
	String bname;
	int bedtn;
	double bprice;
	book(String bname, int bedtn, double bprice )
	{
		this.bname=bname;
		this.bedtn=bedtn;
		this.bprice=bprice;
	}
	void display()
	{
		System.out.println(bname+"\n"+bedtn+"\n"+bprice);
	}
}
public class HQ2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		book b[]=new book[5];
		for (int i=0; i<b.length; i++)
		{
			System.out.println("Enter book name, edition and price for book "+(i+1));
			String bname=sc.next();
			int bedtn=sc.nextInt();
			double bprice=sc.nextDouble();
			b[i]=new book(bname, bedtn, bprice);
		}
		for (int i=0; i<b.length; i++)
		{
			b[i].display();
		}
		double max=b[0].bprice;
		int x=0;
		for (int i=1; i<b.length; i++)
		{
			if (b[i].bprice>max)
			{
				max=b[i].bprice;
				x=i;
			}
		}
		System.out.println("Expensive book is");
		System.out.println(b[x].bname+" "+b[x].bedtn+" "+b[x].bprice);
	}

}
