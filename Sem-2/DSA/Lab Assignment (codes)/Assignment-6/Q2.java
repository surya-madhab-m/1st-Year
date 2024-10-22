import java.util.*;
class node
{
	int info;
	node next;	
}
public class Q2 
{
	public static void push()
	{
		node p=new node();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter info:");
		p.info=sc.nextInt();
		p.next=top;
		top=p;
	}
	public static void pop()
	{
		if (top==null)
		{
			System.out.println("UNDERFLOW!");
		}
		else
		{
			node q=top;
			top=top.next;
			top.next=null;
			System.out.println("Deleted node is "+q.info);
		}
	}
	public static void display()
	{
		if (top==null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			node q=top;
			while (q!=null)
			{
				System.out.println(q.info+"-->");
				q=q.next;
			}
		}
	}
	static node top=null;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("****MENU****");
			System.out.println("0:Exit");
			System.out.println("1:Push");
			System.out.println("2:Pop");
			System.out.println("3:Display");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 0:
				System.exit(0);
				case 1:
					push();
					break;
				case 2:
					pop();
					break;
				case 3:
					display();
					break;
				default:
					System.out.println("Wrong choice");
					break;
			}
		}
	}
}
