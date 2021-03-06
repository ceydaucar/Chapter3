import java.util.*;
public class Exercise_03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		int digits = sc.nextInt();
		
		int d1 = digits / 100000000;
		int remainingDigits = digits % 100000000;
		int d2 = remainingDigits / 10000000;
		remainingDigits %= 10000000;
		int d3 = remainingDigits / 1000000;
		remainingDigits %= 1000000;
		int d4 = remainingDigits / 100000;
		remainingDigits %= 100000;
		int d5 = remainingDigits / 10000;
		remainingDigits %= 10000;
		int d6 = remainingDigits / 1000;
		remainingDigits %= 1000;
		int d7 = remainingDigits / 100;
		remainingDigits %= 100;
		int d8 = remainingDigits / 10;
		remainingDigits %= 10;
		int d9 = remainingDigits;
		
		int calculation = (d1 * 1 + d2 * 2 + d3 * 3 + d4 *4 + d5 *5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		if (calculation == 10) {
			String d10 = "X";
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
		}
		else 
		System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + calculation);
	}

}
