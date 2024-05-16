import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter an integer number: ");
			int number = sc.nextInt();

			if (number < 0) {
				throw new ArithmeticException("Cannot calculate square root of negative numbers.");
			}

			double squareRoot = Math.sqrt(number);
			System.out.println("Square root of " + number + " is: " + squareRoot);
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
