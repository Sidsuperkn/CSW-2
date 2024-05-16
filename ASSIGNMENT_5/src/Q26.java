
public class Q26 {

	public static void main(String[] args) {
		try {
			throw new ClassNotFoundException("Q2");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found: " + e.getMessage());
		}
	}

}
