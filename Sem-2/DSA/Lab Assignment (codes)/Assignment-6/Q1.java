import java.util.*;
public class Q1 
{
	public static void push()
	{
		if (top==MAXSIZE-1)
	    {
		System.out.println("Overflow!!");
		}
		else
	    {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter an element:");
			int n=sc.nextInt();
			top=top+1;
			stack[top]=n;
	    }
	}
	public static void pop()
	{
		if (top==-1)
		{
			System.out.println("Underflow");
		}
		else
		{
			int ele=stack[top];
			System.out.println(("Deleted element is "+ele));
			top=top-1;
		}
	}
	public static void display()
	{
		if (top==-1)
		{
			System.out.println("Stack is empty");
			
		}
		else
		{
			for (int i=top; i>=0; i--)
			{
				System.out.println(stack[i]);
			}
		}
	}
	public static final int MAXSIZE=5;
    public static int stack[]=new int[MAXSIZE];
	public static int top=-1;

	public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		while(true)
	    {
			System.out.println("***MENU***");
			System.out.println("0: Exit");
			System.out.println("1: Push");
			System.out.println("2: Pop");
			System.out.println("3: Display");
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
		    	System.out.println("Invalid choice");
		    }
		 }
	}
}
