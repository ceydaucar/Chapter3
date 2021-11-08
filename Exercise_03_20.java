import java.util.Scanner;

public class Exercise_03_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit between -58ºF and 41ºF: ");
		double ta = sc.nextDouble();
		
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double v = sc.nextDouble();
		
		double twc = 35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16));
		
		if (-58 < ta && ta < 41 && v > 2) {
			System.out.println("The wind chill index is " + twc);
		}
		else {
			System.out.println("Invalid temperature value / wind speed!");
		}
	}

}
