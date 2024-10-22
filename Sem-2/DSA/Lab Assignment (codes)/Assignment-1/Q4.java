import java.util.*;
public class Q4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a string: ");
		String s=sc.next();
		int c=0;
		for (int i=0; i<s.length(); i++)
		{
			for (int j=0; j<s.length(); j++)
			{
				for (int k=0; k<s.length(); k++)
				{
					for (int l=0; l<s.length(); l++)
					{
						for (int m=0; m<s.length(); m++)
						{
							for (int n=0; n<s.length(); n++)
							{
								if (i!=j && j!=k && k!=l && l!=m && m!=n && j!=l && j!=m && j!=n && k!=i && k!=m && k!=n && l!=i && l!=j && l!=n && m!=i && m!=l && n!=i)
								{
									System.out.println(s.charAt(i)+""+s.charAt(j)+""+s.charAt(k)+s.charAt(l)+""+s.charAt(m)+""+s.charAt(n));
									c++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("No. of combinations is: "+c);
		sc.close();
		
					
							
					

	}

}
