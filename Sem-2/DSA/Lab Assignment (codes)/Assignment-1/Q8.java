import java.util.*;
public class Q8{ 


	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter row:");
		int m=sc.nextInt();
		System.out.print("Enter column:");
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array is: ");
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0 ;
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				sum+=a[i][j];
			}
		}
		System.out.println("sum of elements of the 2-D array is "+sum);
		sc.close();
	

	}

}

