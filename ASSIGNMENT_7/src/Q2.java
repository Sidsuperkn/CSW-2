
public class Q2 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = str1.concat(" World");

		System.out.println("Original String: " + str1);
		System.out.println("Concatenated String: " + str2);
		System.out.println("Are they the same object? " + (str1 == str2));

		String str3 = "Java";
		CharSequence charSeq = str3.subSequence(1, 3);

		System.out.println("\nOriginal String: " + str3);
		System.out.println("Subsequence: " + charSeq);
	}

}
