import java.util.Scanner;
public class Q7 
{

	public static void main(String[] args) 
	{
		int u;
		double c=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the unit: ");
		u=sc.nextInt();
		if (u<=50)
		
		{
			c=u*3;
			System.out.println("Montly electric bill is Rs."+c);
		}
		else if (u>50 && u<=200)
		{
			c=(50*3)+((u-50)*4.80);
			System.out.println("Montly electric bill is Rs."+c);
		}
		else if (u>200 && u<=400)
		{
			c=(50*3)+(150*4.80)+((u-200)*5.80);
			
			System.out.println("Montly electric bill is Rs."+c);
		}
		else if (u>400)
		{
			c=(50*3)+(150*4.80)+(200*5.80)+((u-400)*6.20);
			System.out.println("Montly electric bill is Rs."+c);
		}
		else
		{
			System.out.println("Invalid input, should be an integer and greater than 0");
		}
		System.out.print("No. of unit consumed: "+u);
		System.out.print("Do you want to take online(y/n): ");
		char ch=sc.next().charAt(0);
		if (ch=='y'||ch=='Y')
		{
			System.out.println("Total amount is Rs."+c);
			System.out.println("Discount is 3% i.e."+(0.03*c));
			System.out.println("Amount to be paid after discount is Rs."+(c-(0.03*c)));
		}
		else if (ch=='n'||ch=='N')
		{
			System.out.println("Amount to be paid is Rs."+c);
		}
		else
		{
			System.out.println("INVALID INPUT! choose y or Y or N or n");
		}
		sc.close();
			
		
		
	}

}
