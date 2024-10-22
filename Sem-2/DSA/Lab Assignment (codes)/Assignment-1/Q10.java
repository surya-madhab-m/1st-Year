import java.util.*;

public class Q10 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int row=3;
		int col=4;
		double a[][]=new double[row][col];
		for (int i=0; i<row; i++)
		{
			for (int j=0; j<col; j++)
			{
				a[i][j]=sc.nextDouble();
			}
		}
		System.out.println("Array is: ");
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		for (int i=0; i<col; i++)
		{
			System.out.println("Sum of the elements of column-"+(i+1)+" is: "+sumColumn(a, i));
		}
	}
	public static double sumColumn(double m[][], int col)
	{
		double sum=0;
		for (int i=0; i<m.length; i++)
		{
			sum+=m[i][col];
		}
		return sum;
		
	}

}
