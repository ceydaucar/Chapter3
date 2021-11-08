import java.util.*;
public class Exercise_03_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
		double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);
		
		System.out.println("The point " + ((x > intersectx || y > intersecty) ? "is not " : "is " ) + "in the triangle");
	}

}
