import java.util.*;
public class Exercise_03_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 , y1, x2, y2, x3, y3, x4, y4: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		double x4 = sc.nextDouble();
		double y4 = sc.nextDouble();
		
		double part1 = (y1 - y2);
		double part2 = - (x1 - x2);
		double part3 = (y1 - y2) * x1 - (x1 - x2) * y1;
		double part4 = (y3 - y4);
		double part5 = - (x3 - x4);
		double part6 =(y3 - y4) * x3 - (x3 - x4) * y3;
		
		double x = (part3 * part5 - part2 * part6) / (part1 * part5 - part2 * part4); 
		double y = (part1 * part6 - part3 * part4) / (part1 * part5 - part2 * part4);
		
		if (part1 * part5 - part2 * part4 == 0)
			
			System.out.println("The two lines are parallel.");
			
		else
			System.out.println("The intersecting point is at " + "(" 
		+ x + "," + y + ")");
	}

}
