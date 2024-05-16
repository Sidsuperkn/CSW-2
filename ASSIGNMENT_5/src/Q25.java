import java.util.*;

public class Q25 {
	public static int readingIntegerFromUser() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.print("Enter an integer: ");
				number = sc.nextInt();
				validInput = true;
			} catch (Exception e) {
				System.out.println("Invalid input please enter a valid input .");
				sc.next();
			}
		}
		return number;
	}

	public static void main(String[] args) {
		int n = readingIntegerFromUser();
		System.out.println("Correct input : " + n);

	}

}
