import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String inputString = sc.nextLine();

		boolean exit = false;
		while (!exit) {
			System.out.println("\nMenu:");
			System.out.println("1. Convert to lowercase");
			System.out.println("2. Convert to uppercase");
			System.out.println("3. Search for a character");
			System.out.println("4. Get character at index");
			System.out.println("5. Concatenate with another string");
			System.out.println("6. Exit");
			System.out.println("Choose an option:");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Result: " + inputString.toLowerCase());
				break;
			case 2:
				System.out.println("Result: " + inputString.toUpperCase());
				break;
			case 3:
				System.out.println("Enter a character to search:");
				char searchChar = sc.next().charAt(0);
				if (inputString.indexOf(searchChar) != -1) {
					System.out.println("Character '" + searchChar + "' found in the string.");
				} else {
					System.out.println("Character '" + searchChar + "' not found in the string.");
				}
				break;
			case 4:
				System.out.println("Enter an index :");
				int index = sc.nextInt();
				if (index >= 0 && index < inputString.length()) {
					System.out.println("Character at index " + index + ": " + inputString.charAt(index));
				} else {
					System.out
							.println("Invalid index. The index should be between 0 and " + (inputString.length() - 1));
				}
				break;
			case 5:
				System.out.println("Enter another string to concatenate:");
				String anotherString = sc.nextLine();
				System.out.println("Result: " + inputString.concat(anotherString));
				break;
			case 6:
				exit = true;
				break;
			default:
				System.out.println("Invalid choice. Please choose again.");
			}
		}

		sc.close();
	}

}
