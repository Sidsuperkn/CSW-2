import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String inputString = sc.nextLine();

		char[] charArray = inputString.toCharArray();

		System.out.println("Enter a character to search in the string:");
		char searchChar = sc.next().charAt(0);

		int firstOccurrence = -1;
		int lastOccurrence = -1;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == searchChar) {
				if (firstOccurrence == -1) 
					firstOccurrence = i;
				lastOccurrence = i;
			}
		}

		System.out.println("\nCharacter Array:");
		System.out.println(charArray);

		if (firstOccurrence != -1) {
			System.out.println("First & Last occurrence of '" + searchChar + "' at position: " + firstOccurrence+ " " + lastOccurrence);
		} else {
			System.out.println("Character '" + searchChar + "' not found in the string.");
		}

		sc.close();
	}

}
