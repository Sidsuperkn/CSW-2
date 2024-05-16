import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of x in radians: ");
		double x = sc.nextDouble();
		
		try {
			if (Math.abs(x % (Math.PI / 2)) == 0 ) {
				throw new ArithmeticException("Error: x is close to multiples of π/2. Division by zero error.");
			} 
			double result = (Math.sin(x) + Math.cos(x)) / Math.tan(x);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			sc.close();
		}

	}

}
