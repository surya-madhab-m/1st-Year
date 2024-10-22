import java.util.*;
class Product
{
	int prodId;
	double price;
	int quantity;
	static double totalprice=0.0;
	Product(int prodId, double price, int quantity)
	{
		this.prodId=prodId;
		this.price=price;
		this.quantity=quantity;
	}
	void display()
	{
		System.out.println(prodId+" "+price+" "+quantity);
	}
}
public class Q3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Product p[]=new Product[5];
		for(int i=0; i<p.length; i++)
		{
			System.out.println("Enter product details "+(i+1));
			int prodId=sc.nextInt();
			double price=sc.nextDouble();
			int quantity=sc.nextInt();
			p[i]=new Product(prodId, price, quantity);
			Product.totalprice=Product.totalprice+(price*quantity);
		
			
		}
		for (int i=0; i<p.length; i++)
		{
			p[i].display();
		}
		System.out.println("Total price is:"+Product.totalprice);	
	}

}
