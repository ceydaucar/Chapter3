import java.util.*;
public class Exercise_03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("3.1");
		
		System.out.println("Enter a, b, c: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double discriminant = b * b - (4 * a * c);
		
		double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
		double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
		
		if (discriminant > 0) 
			System.out.println("The equation has two roots " + r1 + " and " + r2);	
		
		else if (discriminant == 0)
			System.out.println("The equation has one root " + (int)(r1));
		
		else // discriminant < 0
			System.out.println("The equation has no real roots");
	}

}
