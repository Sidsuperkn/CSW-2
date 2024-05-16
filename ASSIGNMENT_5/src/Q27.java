
public class Q27 {
	public static void main(String[] args) {
		try {
			Object obj = new Integer(10);
			System.out.println("Value : " + (String) obj);
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
	}
}
