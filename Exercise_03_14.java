import java.util.*;
public class Exercise_03_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int coin = (int)(Math.random() * 2);
		
		System.out.println("(0)- Head \n(1)- Tail \nEnter your guess:");
		int guess = sc.nextInt();
		
		System.out.println(((coin==guess) ? "Correct guess. Congrats!" : "Wrong guess. Try again"));
	}

}
