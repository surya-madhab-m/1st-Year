import java.util.*;
public class Q9 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int row=4;
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
		System.out.println("Sum of the major diagonal of the matrix is "+sumMajorDiagonal(a));
		sc.close();
	}
	public static double sumMajorDiagonal(double m[][])
	{
		double sum=0;
		for (int i=0; i<m.length; i++)
		{
			for (int j=0; j<m[i].length; j++)
			{
				if (i==j)
				{
					sum+=m[i][j];
				}
			}
		}
		return sum;
	}
	

}
