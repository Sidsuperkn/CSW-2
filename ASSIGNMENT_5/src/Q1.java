
public class Q1 {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println("The length of the string is : " + str.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException caught: " + e.getMessage());
		}
	}

}



