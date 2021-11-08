import java.util.Scanner;

public class Exercise_03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		// Receive the amount
		System.out.print("Enter an amount as integer, for example 1156 for 11.56: ");
		int amount = sc.nextInt();

		int remainingAmount = amount;

		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount %= 100;

		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;

		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;

		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;

		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;

		// Display results
		System.out.println("Your amount " + amount / 100.0 + " consists of");
		
		if (numberOfOneDollars > 1) {
		System.out.println(" " + numberOfOneDollars + " dollars");
		}
		else 
			System.out.println(" " + numberOfOneDollars + " dollar");
		
		
		if (numberOfQuarters > 1) {
			System.out.println(" " + numberOfQuarters + " quarters");
		}
		else 
			System.out.println(" " + numberOfQuarters + " quarter");
		
		
		if (numberOfDimes > 1) {
			System.out.println(" " + numberOfDimes + " dimes");
		}
		else 
			System.out.println(" " + numberOfDimes + " dime");

		
		if (numberOfNickels > 1) {
			System.out.println(" " + numberOfNickels + " nickels");
		}
		else 
			System.out.println(" " + numberOfNickels + " nickel");
		
		
		if (numberOfPennies > 1) {
			System.out.println(" " + numberOfPennies + " pennies");
		}
		else 
			System.out.println(" " + numberOfPennies + " pennie");
	}

}
