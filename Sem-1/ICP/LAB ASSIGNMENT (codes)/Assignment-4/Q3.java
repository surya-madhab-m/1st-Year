import java.util.*;
public class Q3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,min=1,max=6;
		System.out.print("Enter a no.");
		n=sc.nextInt();
		Random r=new Random();
		int c=1;
		int s=0;
		System.out.print("Random numbers generated are: ");
	    do {
	    	int r1=(int)(Math.random()*n)+1;
			System.out.print(r1+" ");
			s+=r1;
			c++;
	    }
		while (c<=n);
	    double avg=(double)(s/n);
	    System.out.println(" ");
		System.out.println("Average of 6 randomns are: "+avg);
		sc.close();
		

	}

}
