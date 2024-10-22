import java.util.*;
class Person
{
	String name;
	int age;
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and age:");
		name=sc.next();
		age=sc.nextInt();
		sc.close();
		
	}
	void Display()
	{
		System.out.println(name+" "+age);
	}
}
public class Q1 
{

	public static void main(String[] args) 
	{
		Person p1=new Person();
		Person p2=new Person();
		p1.name="Rohan";
		p1.age=32;
		p2.setData();
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
