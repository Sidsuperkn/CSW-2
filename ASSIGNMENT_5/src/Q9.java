import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter numerator and denominator : ");
			int nume = sc.nextInt();
			int deno = sc.nextInt();
			if(deno == 0 ) throw new ArithmeticException("Can't be divided by zero");
			System.out.println("The division result is : "+(nume/deno));
		} catch (ArithmeticException e) {
			System.out.println("Error : "+e.getMessage());
		}
	}

}
