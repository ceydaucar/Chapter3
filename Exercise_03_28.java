import java.util.*;
public class Exercise_03_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter r1's center x-, y-coordinates, width and height: ");
		double r1X = sc.nextDouble();
		double r1Y = sc.nextDouble();
		double r1Width = sc.nextDouble();
		double r1Height = sc.nextDouble();
		
		System.out.println("Enter r2's center x-, y-coordinates, width and height: ");
		double r2X = sc.nextDouble();
		double r2Y = sc.nextDouble();
		double r2Width = sc.nextDouble();
		double r2Height = sc.nextDouble();
		
		if	((Math.pow(Math.pow(r2Y - r1Y, 2), .05) + r2Height / 2 <= r1Height / 2) && 
				(Math.pow(Math.pow(r2X - r1X, 2), .05) + r2Width / 2 <= r1Width / 2) &&
				(Math.pow(Math.pow(r2X - r1X, 2) + Math.pow(r2Y - r2X, 2), .05) <= r1Height / 2) &&
				(Math.pow(Math.pow(r2X - r1X, 2) + Math.pow(r2Y - r2X, 2), .05) <= r1Width / 2))
				System.out.println("r2 is inside r1");
			else if ((r1X + r1Width / 2 > r2X - r2Width) ||
						(r1Y + r1Height / 2 > r2Y - r2Height))
				System.out.println("r2 overlaps r1");
			else
				System.out.println("r2 does not overlap r1");
		
	}

}
