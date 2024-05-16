
@SuppressWarnings("serial")
class CustomNullPointerException extends Exception {
	CustomNullPointerException(String message) {
		super(message);
	}
}

public class Q3 {

	public static void main(String[] args) {
		try {
			String a = null;
			if (a == null) throw new CustomNullPointerException("String is null");
		} catch (CustomNullPointerException e) {
			System.out.println("CustomNullPointerException occured : " + e.getMessage());
		}
	}
}