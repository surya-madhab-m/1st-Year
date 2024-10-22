import java.util.*;
public class Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("TO CALCULATE THE BODY MASS INDEX:");
		System.out.print("Enter the height: ");
		double h=sc.nextDouble();
		System.out.print("Enter the weight: ");
		double w=sc.nextDouble();
		double bmi=w/(h*h);
		if (bmi<18.5)
		{
			System.out.println("Underweight");
		}
		else if (bmi>=18.5 && bmi<=24.9)
		{
			System.out.println("Normal weight");
		}
		else if (bmi>=25.0 && bmi<=29.9)
		{
			System.out.println("Overweight");
		}
		else if (bmi>=30.0)
		{
			System.out.println("Obese");
			
		}
		else
		{
			System.out.println("INVALID");
		}
		sc.close();
		
	}

}
