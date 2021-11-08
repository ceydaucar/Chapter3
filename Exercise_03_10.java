import java.util.*;
public class Exercise_03_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n1 = (int)(Math.random() * 100);
		int n2 = (int)(Math.random() * 100);
		
		int sum = n1 + n2;
		
		System.out.println("What is " + n1 + " + " + n2 + " ?");
		int answer = sc.nextInt();
		
		if (sum == answer) {
			System.out.println("You are correct!");
		}
		else
			System.out.println("You are wrong " + n1 + " + " + n2 + " should be " + sum);
		
	}

}
