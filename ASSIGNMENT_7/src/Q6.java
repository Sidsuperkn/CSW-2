import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings : ");
		String str1 = sc.next();
		String str2 = sc.next();
		
        String firstLowerCase = str1.toLowerCase();
        String firstUpperCase = str1.toUpperCase();
        String secondLowerCase = str2.toLowerCase();
        String secondUpperCase = str2.toUpperCase();

        boolean isEqual = firstLowerCase.equals(secondLowerCase);

        System.out.println("\nConverted Strings:");
        System.out.println("First String (Lowercase): " + firstLowerCase);
        System.out.println("First String (Uppercase): " + firstUpperCase);
        System.out.println("Second String (Lowercase): " + secondLowerCase);
        System.out.println("Second String (Uppercase): " + secondUpperCase);
        System.out.println("\nCase-Insensitive Equality Result: " + isEqual);

        sc.close();
	}

}
