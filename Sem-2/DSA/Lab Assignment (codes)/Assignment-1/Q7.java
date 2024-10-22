import java.util.*;
public class Q7 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a no.");
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array is:");
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int max=a[0];
		int min=a[0];
		for (int i=1; i<a.length; i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
			if (a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Maximun element is "+max+" and it has occured "+count(a,max)+" times.");
		System.out.println("Minimun element is "+min+" and it has occured "+count(a,max)+" times.");
		System.out.println("Maximun element has occured at index "+indmax(a,max));
		System.out.println("Minimun element has occured at index "+indmin(a,min));
	}
	public static int count(int a[], int x)
	{
		int count=0;
		for (int i=0; i<a.length; i++)
		{
			if (a[i]==x)
			{
				count+=1;
			}
		}
		return count;
	}
	public static int indmin(int a[], int min)
	{
		int minc=0;
		for (int i=0; i<a.length; i++)
		{
			if (min==a[i])
			{
				minc=i;
				
			}
		}
		return minc;
	}
	public static int indmax(int a[], int max)
	{
		int maxc=0;
		for (int i=a.length-1; i>=0; i--)
		{
			if (max==a[i])
			{
				maxc=i;
				
			}
		}
		return maxc;
	}
	
		
		
		

	

}
