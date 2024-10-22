import java.util.*;
class Person3
{
	String name;
	int age;
	void setData(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	void Display()
	{
		System.out.println(name+" "+age);
	}
}
public class Q1m4
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		int n=sc.nextInt();
		Person3 p[]=new Person3[n];
		for (int i=0; i<p.length; i++)
		{
			p[i]=new Person3();
		}
		for (int i=0; i<p.length; i++)
		{
			String name=sc.next();
			int age=sc.nextInt();
			p[i].setData(name, age);
		}
		for (int i=0; i<p.length; i++)
		{
			p[i].Display();
		}
		int younger=p[0].age;
		int index=0;
		String yn=p[0].name;
		for (int i=1; i<p.length; i++)
		{
			if ((p[i].age<younger)&&(p[i].name!=yn))
			{
				younger=p[i].age;
				index=i;
			}
		}
		System.out.println(p[index].name+" is younger");
		for (int i=0; i<p.length && i!=index; i++)
		{
			if ((p[i].age==younger)&&(p[i].name!=yn))
			{
				System.out.println(p[i].name+" is younger");
			}
		}
		
		
	}
}
		
			