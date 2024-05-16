import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter a number: ");
			String input = sc.nextLine();
			int number = Integer.parseInt(input);

			try {
				int result = 100 / number;
				System.out.println("Result: " + result);
			} catch (ArithmeticException e) {
				System.out.println("Error: Arithmetic exception occurred - " + e.getMessage());
			}
		} catch (NumberFormatException e) {
			System.out.println("Error: Number format exception occurred - " + e.getMessage());
		}
	}

}
