import java.util.*;
class Person1
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
public class Q1m2 
{

	public static void main(String[] args) 
	{
		Person1 p1=new Person1();
		Person1 p2=new Person1();
		p1.name="Rohan";
		p1.age=20;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and age:");
		String name=sc.next();
		int age=sc.nextInt();
		p2.setData(name, age);
		p1.Display();
		p2.Display();
		if (p1.age<p2.age)
		{
			System.out.println(p1.name+" is younger");
		}
		else
		{
			System.out.println(p2.name+" is younger");
		}
	}

}
