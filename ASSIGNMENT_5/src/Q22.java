class CustomCheckedException extends Exception {
	public CustomCheckedException(String message) {
		super(message);
	}
}

public class Q22 {

	public static void main(String[] args) throws Exception {
		try {
			int a = 10, b = 0;
			if(b == 0) throw new CustomCheckedException("Can't be Zero");
			System.out.println("Result: " + a / b);
		} catch (CustomCheckedException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
