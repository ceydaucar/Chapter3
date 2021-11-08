import java.util.Scanner;

public class Exercise_03_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int computerNumber = (int)(Math.random() * 3);

	    // Prompt the user to enter scissor, rock, or paper
	    Scanner input = new Scanner(System.in);
	    System.out.print("scissor (0), \nrock (1), \npaper (2): ");
	    int userNumber = input.nextInt();
	    
	    // Check the guess
	    switch (computerNumber) {
	      case 0:    // scissor (0) case
		  
				if (userNumber == 0) {
					System.out.println("The computer is scissor. You are scissor too. It is a draw");
				}
				else if (userNumber == 1) {
					System.out.println("The computer is scissor. You are rock. You won");
				}
				else if (userNumber == 2) {
					System.out.println("The computer is scissor. You are paper. Computer won");
				}
				break;
		  
	      case 1:	// rock (1) case
		  
				if (userNumber == 0) {
					System.out.println("The computer is rock. You are scissor too. Computer won");
				}
				else if (userNumber == 1) {
					System.out.println("The computer is rock. You are rock. It is a draw");
				}
				else if (userNumber == 2) {
					System.out.println("The computer is rock. You are paper. You won");
				}
				break;
		  
	      case 2:   // paper (2)case
		  
				if (userNumber == 0) {
					System.out.println("The computer is paper. You are scissor too. You won");
				}
				else if (userNumber == 1) {
					System.out.println("The computer is paper. You are rock. Computer won");
				}
				else if (userNumber == 2) {
					System.out.println("The computer is paper. You are paper. It is a draw");
				}
				break;
	    }
	}

}
