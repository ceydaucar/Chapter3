import java.util.Scanner;
public class Exercise_03_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a point with two coordinates: ");
		double x = sc.nextDouble();
		double y =sc.nextDouble();
		
		boolean inRectangle = x <= (10/2) && y <= (5/2);
		
		System.out.println((inRectangle) ? "Point (" + x + ", " + y + ") is in the rectangle" : "Point (" + x + ", " + y + ") is not in the rectangle");
		
	}

}
