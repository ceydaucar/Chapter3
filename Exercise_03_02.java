import java.util.*;
public class Exercise_03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);

		int digit1 = (int)(Math.random() * 10);
		int digit2 = (int)(Math.random() * 10);
		int digit3 = (int)(Math.random() * 10);
		
		System.out.print("What is " + digit1 + " + " + digit2 + " + " + digit3 + "? ");
		int answer = sc.nextInt();
		
		System.out.println(digit1 + " + " + digit2 + " + " + digit3 + " = " + answer + " is " +
				(digit1 + digit2 + digit3 == answer));
	}

}
