import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence:");
		String sentence = sc.nextLine();

		System.out.println("Enter the word to search for:");
		String searchWord = sc.next();
		sc.nextLine();
		System.out.println("Enter the word to replace it with:");
		String replaceWord = sc.next();

		int index = sentence.indexOf(searchWord);
		if (index != -1) {
			String modifiedSentence = sentence.substring(0, index) + replaceWord
					+ sentence.substring(index + searchWord.length());

			System.out.println("\nOriginal Sentence: " + sentence);
			System.out.println("Modified Sentence: " + modifiedSentence);
		} else {
			System.out.println("The word '" + searchWord + "' was not found in the sentence.");
		}

		sc.close();
	}

}
