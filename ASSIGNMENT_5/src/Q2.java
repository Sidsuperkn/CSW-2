import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();

		try {
			displayNumericCharacters(inputString);
		} catch (NullPointerException e) {
			System.out.println("Error: Input string is null.");
			sc.close();
		}
	}

	public static void displayNumericCharacters(String input) {
		if (input == null || input.isEmpty()) {
			throw new NullPointerException("Input string is null.");
		}
		
		int count = 0;

		for (int i = 2; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			char prevChar = input.charAt(i - 2);
			char prevPrevChar = input.charAt(i - 1);

			if (Character.isDigit(currentChar) && isVowel(prevChar) && !isVowel(prevPrevChar)) {
				System.out.println("Numeric character '" + currentChar + "' found after a vowel and consonant.");
				count++;
			}
		}

		if (count == 0) {
			System.out.println("No numeric characters found after a vowel and consonant.");
		}
	}

	private static boolean isVowel(char c) {
		return "aeiouAEIOU".indexOf(c) != -1;
	}

}
