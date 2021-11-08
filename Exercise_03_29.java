import java.util.*;
public class Exercise_03_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter circle1's center x- ,y-coordinates and radius: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r1 = sc.nextDouble();
		
		System.out.println("Enter circle2's center x- ,y-coordinates and radius: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double r2 = sc.nextDouble();
		
		if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) 
				<= Math.abs(r1 - r2))
				System.out.println("circle2 is inside circle1");
			else if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5)
						<= r1 + r2)
				System.out.println("circle2 overlaps circle1");
			else
				System.out.println("circle2 does not overlap circle1");
		
	}

}
