import java.util.*;
public class Exercise_03_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int lottery = (int)(Math.random() * 1000);
		
		System.out.println("Enter your lottery pick (three digits): ");
		int guess = sc.nextInt();
		
		// Get digits from lottery
		int lotteryDigit1 = lottery / 100;
		int remainingLDigit = lottery % 100;
		int lotteryDigit2 = remainingLDigit / 10;
		int lotteryDigit3 = remainingLDigit %10;
		
		// Get digits from guess
		int guessDigit1 = guess / 100;
		int remainingGDigit = guess % 100;
		int guessDigit2 = remainingGDigit / 10;
		int guessDigit3 = remainingGDigit %10;
		
		System.out.println("The lottery number is " + lottery);
		
		// Check the guess
		if (guess == lottery)
		{
			System.out.println("Exact match: You win $10,000");
		}
		
		else if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2
				|| guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3
				|| guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2
				|| guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
		{
			System.out.println("Match all digits: you win $3,000");
		}
		
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 ||
				 guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 ||
				 guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) 
		{
			System.out.println("Match one digit: you win $1,000");
		}
		
		else
			System.out.println("Sorry, no match");
		
	}

}
