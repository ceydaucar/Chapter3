import java.util.*;
public class Exercise_03_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int convert = sc.nextInt();
		
		if (convert == 0)
		{
			System.out.println("Enter the dollar amount: ");
			double dollarAmount = sc.nextDouble();
			
			System.out.println("$" + dollarAmount + " is " + (rate * dollarAmount) + " yuan");
		}	
		else if (convert == 1)
		{
			System.out.println("Enter the RMB amount: ");
			double RMBamount = sc.nextDouble();
			
			System.out.println(RMBamount + " yuan is " + "$" + (int)((RMBamount / rate) * 100) / 100.0);
		}	
		else
			System.out.println("Incorrect input");
			
	}

}
