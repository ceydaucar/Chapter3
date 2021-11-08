import java.util.*;
public class Exercise_03_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = sc.nextInt();
		
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHours = (totalHours + offset) % 24;
		
		System.out.println("Current time is " + ((currentHours > 12) ? currentHours - 12 : 
			currentHours) + ":" + currentMinutes + ":" + currentSeconds +
			((currentHours > 12) ? " PM" : " AM"));
		
	}

}
