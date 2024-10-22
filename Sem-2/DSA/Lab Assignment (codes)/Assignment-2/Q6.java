abstract class marks
{
	double markicp;
	double markdsa;
	double percentage;
	marks(double markicp, double markdsa)
	{
		this.markdsa=markdsa;
		this.markicp=markicp;
	}
	abstract double getpercentage();
}
class cse extends marks
{
	double ad;
	cse(double markicp, double markdsa, double ad)
	{

		super(markicp, markdsa);
		this.ad=ad;
	}
	double getpercentage()
	{
		double t=markdsa+markicp+ad;
		percentage=((t/300)*100);
		return percentage;
	}
}
class noncse extends marks
{
	double mmech;
	noncse(double markicp, double markdsa, double ad)
	{
		super(markicp, markdsa);
		this.mmech=mmech;

	
	}
	double getpercentage()
	{
		double t=markdsa+markicp+mmech;
		percentage=((t/300)*100);
		return percentage;  
	}
}
public class Q6 
{

	public static void main(String[] args) 
	{
		cse c1=new cse(78,86,92);
		noncse nc1=new noncse(60,70,80);
		System.out.println("percentage secured is by cse "+c1.getpercentage());
		System.out.println("percentage secured is by noncse "+nc1.getpercentage());
	}

}
