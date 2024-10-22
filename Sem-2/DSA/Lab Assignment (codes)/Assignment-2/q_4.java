
public class q_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class Deposit {
		    private long Principal;
		    private int Time;
		    private double Rate;
		    private double TotalAmt;

		    // Constructor1: Deposit ( )
		    public Deposit() {
		        this.Principal = 0;
		        this.Time = 0;
		        this.Rate = 0.0;
		    }

		    // Constructor2: Deposit (long, int, double)
		    public Deposit(long Principal, int Time, double Rate) {
		        this.Principal = Principal;
		        this.Time = Time;
		        this.Rate = Rate;
		    }

		    // Constructor3: Deposit (long, int)
		    public Deposit(long Principal, int Time) {
		        this.Principal = Principal;
		        this.Time = Time;
		        this.Rate = 0.0;
		    }

		    // Constructor4: Deposit (long, double)
		    public Deposit(long Principal, double Rate) {
		        this.Principal = Principal;
		        this.Time = 0;
		        this.Rate = Rate;
		    }

		    // display ( ): to display the value of instance variables
		    public void display() {
		        System.out.println("Principal: " + this.Principal);
		        System.out.println("Time: " + this.Time);
		        System.out.println("Rate: " + this.Rate);
		        System.out.println("Total Amount: " + this.TotalAmt);
		    }

		    // calcAmt( ): to calculate the total amount
		    public void calcAmt() {
		        this.TotalAmt = this.Principal + (this.Principal * this.Rate * this.Time) / 100;
		    }
		}


	}

}
