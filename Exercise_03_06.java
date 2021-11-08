import java.util.*;
public class Exercise_03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		double weight = sc.nextDouble();
		
		System.out.println("Enter feet: ");
		double feet = sc.nextDouble();
		
		System.out.println("Enter inches: ");
		double inches = sc.nextDouble();
		
		final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
		final double METERS_PER_INCH = 0.0254; 		  // Constant
		final double FEET_PER_INCH = 0.0833333;	     // Constant
		
		weight *= KILOGRAMS_PER_POUND; 
		double height = (inches += feet / FEET_PER_INCH) * METERS_PER_INCH;
		double bmi = weight / (Math.pow(height, 2));

		// Display result
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}

}
