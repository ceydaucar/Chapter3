import java.util.*;
public class Exercise_03_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int x = sc.nextInt();
		
		boolean isDivisibleBoth = x % 5 == 0 && x % 6 == 0;
		
		boolean isDivisibleLeastOne = x % 5 == 0 || x % 6 == 0;
		
		boolean isDivisibleForOne = x % 5== 0 ^ x % 6 == 0;
		
		System.out.println("Is 10 divisible by 5 and 6? " + ((isDivisibleBoth) ? "true" : "false"));
		
		System.out.println("Is 10 divisible by 5 or 6? " + ((isDivisibleLeastOne) ? "true" : "false"));
		
		System.out.println("Is 10 divisible by 5 or 6 but not both? " + ((isDivisibleForOne) ? "true" : "false"));
	}

}
