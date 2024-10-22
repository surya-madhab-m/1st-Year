
public class Problem1_RotateRight 
{

	public static void main(String[] args) 
	{
		int a[]= {10, 11, 12, 13};
		System.out.println("Original Array is: ");
		printArray(a);
		System.out.println("Original array with elements corresponding to their bonary equivalence is: ");
		printBinaryArray(a);
		rotateRightBy2Bits(a);
		System.out.println("After Rotation, array showing elements of 32 bits Binary equivalent is: ");
		printBinaryArray(a);
		System.out.println("After rotation array is: ");
		printArray(a);
	}
	public static void printArray(int s[])
	{
		for (int i=0; i < s.length; i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	public static void printBinaryArray(int s[])
	{
		for (int i = 0; i < s.length; i++) 
		{
			System.out.print(String.format("%32s", Integer.toBinaryString(s[i])).replace(' ', '0') + " ");
	    }
		System.out.println();	}
	public static void rotateRightBy2Bits(int s[])
	{
		for (int i=0; i<s.length; i++)
		{
			int temp=s[i];
			int k=temp<<30; 
		    int p=temp>>2;
		    s[i]=k|p;
		}
	}
}
