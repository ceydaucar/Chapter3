import java.util.Scanner;
public class Exercise_03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter today's day: ");
		int todaysNumber = sc.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		int elapsedDayNumber = sc.nextInt();
		
		switch (todaysNumber % 7) {
		case 0 :
			System.out.print("Today is Sunday ");
			break;
		
		case 1 :
			System.out.print("Today is Monday ");
			break;
		
		case 2 :
			System.out.print("Today is Tuesday ");
			break;
		
		case 3 :
			System.out.print("Today is Wednesday ");
			break;
			
		case 4 :
			System.out.print("Today is Thursday ");
			break;
			
		case 5 :	
			System.out.print("Today is Friday ");
			break;
			
		case 6 :
			System.out.print("Today is Saturday ");
			break;	
		}
		
		int futureDay = elapsedDayNumber + todaysNumber;
		
		switch (futureDay % 7) {
		case 0 :
			System.out.print("and the future day is Sunday");
			break;
		
		case 1 :
			System.out.print("and the future day is Monday");
			break;
		
		case 2 :
			System.out.print("and the future day is Tuesday");
			break;
		
		case 3 :
			System.out.print("and the future day is Wednesday");
			break;
			
		case 4 :
			System.out.print("and the future day is Thursday");
			break;
			
		case 5 :	
			System.out.print("and the future day is Friday");
			break;
			
		case 6 :
			System.out.print("and the future day is Saturday");
			break;
		}	
	}

}
