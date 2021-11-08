import java.util.Scanner;
public class Exercise_03_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three integers: "); /// 1 2 3
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int min = 0;
		
		if (n2 > n1) {
			n1 = min; //1
			n2 = n1; 
			n2 = min; // n2 = 1
		}
		
		if (n3 > n2) {
			n2 = min; //1
			n3 = n2;
			n3 = min; // n3 = 1
		}
		
		if (n2 > n1) {
			n1 = min;
			n2 = n1;
			n2 = min;
		}
		
		System.out.println(n1 + n2 + n3);
		
	}

}
