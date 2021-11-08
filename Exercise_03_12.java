import java.util.*;
public class Exercise_03_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a three-digit integer: ");
		int digit = sc.nextInt();
		
		int first = digit % 10;
		int remainingNumber = digit / 10;
		int second = remainingNumber % 10;
		int third = remainingNumber / 10;
		
		if (first == third) {
			System.out.println(digit + " is a palindrome");
		}
		else
			System.out.println(digit + " is not a palindrome");
	}

}
