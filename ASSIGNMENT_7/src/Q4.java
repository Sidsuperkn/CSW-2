import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder("Hello Aditya");
		boolean exit = false;
		
		while (!exit) {
			System.out.println("\nCurrent string: " + stringBuilder.toString());
			System.out.println("Choose an operation:");
			System.out.println("a. Add a substring at a specified position");
			System.out.println("b. Remove a range of characters");
			System.out.println("c. Modify a character at a specified index");
			System.out.println("d. Concatenate another string at the end");
			System.out.println("e. Exit");

			char choice = sc.next().charAt(0);
			sc.nextLine(); 

			switch (choice) {
			case 'a':
				System.out.println("Enter the substring to add:");
				String val = sc.nextLine();
				System.out.println("Enter the position to add at:");
				int pos = sc.nextInt();
				stringBuilder.insert(pos, val);
				break;
			case 'b':
				System.out.println("Enter the start index:");
				int start = sc.nextInt();
				System.out.println("Enter the end index:");
				int end = sc.nextInt();
				stringBuilder.delete(start, end);
				break;
			case 'c':
				System.out.println("Enter the index :");
				int index = sc.nextInt();
				System.out.println("Enter the new character:");
				char newChar = sc.next().charAt(0);
				stringBuilder.setCharAt(index, newChar);
				break;
			case 'd':
				System.out.println("Enter a string :");
				String toConcatenate = sc.nextLine();
				stringBuilder.append(toConcatenate);
				break;
			case 'e':
				exit = true;
				break;
			default:
				System.out.println("Invalid choice. Please choose again.");
			}
		}

		System.out.println("Final string: " + stringBuilder.toString());
		sc.close();

	}

}
