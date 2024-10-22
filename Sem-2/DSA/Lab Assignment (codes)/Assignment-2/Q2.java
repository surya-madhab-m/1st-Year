import java.util.*;
class Complex
{
	int real;
	int img;
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		real=sc.nextInt();
		img=sc.nextInt();
	}
	void display()
	{
		System.out.println(real+"+"+img+"i");
	}
	Complex Add(Complex c1, Complex c2)
	{
		Complex c3=new Complex();
		c3.real=c1.real+c2.real;
		c3.img=c1.img+c2.img;
		return c3;
	}
}
public class Q2
{

	public static void main(String[] args)
	{
		Complex c1=new Complex();
		Complex c2=new Complex();
		Complex c3=new Complex();
		System.out.println("Eneter 1st complex no.");
		c1.setData();
		System.out.println("Enter 2nd complex no.");
		c2.setData();
		c1.display();
		c2.display();
		c3=c3.Add(c1, c2);
		System.out.println("Sum is: ");
		c3.display();
	}
}
	
