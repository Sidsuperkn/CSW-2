import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numString;
		while (true) {
			try {
				System.out.print("Enter a valid number : ");
				numString = sc.next();
				int num = Integer.parseInt(numString);
				System.out.println("The value is : " + num);
				break;
			} catch (NumberFormatException e) {
				System.out.println("NumberFormatException occured : " + e.getMessage());
			}
		}
	}

}
