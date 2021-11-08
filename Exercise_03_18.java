import java.util.*;
public class Exercise_03_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter weight of the package ");
		int w = sc.nextInt();
		
		double costPerPound = 0;
		
		if (w > 50)
		{
			System.out.println("This package cannot be shipped. ");
		}
		else if (w > 0 && w <= 1) {
			costPerPound = 3.5;
		}
		else if (w > 1 && w <= 3) {
			costPerPound = 5.5;
		}
		else if (w > 3 && w <= 10) {
			costPerPound = 8.5;
		}
		else if (w > 10 && w <= 20) {
			costPerPound = 10.5;
		}
		
		System.out.println("Shipping cost of package is $" + costPerPound * w);
	}

}
