import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value :");
		try {
			int a = Integer.parseInt(sc.next());
			System.out.println("The value of a is : "+a);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException occured : "+e.getMessage());
			sc.close();
		}
	}

}
