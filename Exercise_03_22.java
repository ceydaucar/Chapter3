import java.util.Scanner;
public class Exercise_03_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a point with two coordinates: ");
		double x = sc.nextDouble();
		double y =sc.nextDouble();
		
		boolean inCircle = (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);
		
		
		System.out.println((inCircle) ? "Point (" + x + ", " + y + ") is in the circle" : "Point (" + x + ", " + y + ") is not in the circle");
		
	}

}
