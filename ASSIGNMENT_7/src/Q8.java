import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string:");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string:");
		String str2 = sc.nextLine();

		String concatenatedStringMethod = str1.concat(str2);
		String concatenatedStringOperator = str1 + str2;

		System.out.println("\nConcatenated String using concat(): " + concatenatedStringMethod);
		System.out.println("Concatenated String using + operator: " + concatenatedStringOperator);

		System.out.println("\nEnter an index number :");
		int index = sc.nextInt();

		if (index >= 0 && index < concatenatedStringMethod.length()) {
			char characterAtIndex = concatenatedStringMethod.charAt(index);
			System.out.println("Character at index " + index + ": " + characterAtIndex);
		} else {
			System.out.println(
					"Invalid index. The index should be between 0 and " + (concatenatedStringMethod.length() - 1));
		}

		sc.close();

	}

}
