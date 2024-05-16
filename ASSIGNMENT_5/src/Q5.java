
public class Q5 {
	public static void main(String[] args) {
		try {
			double x = 0.5;
			Double y = null;
			double z = 0.0;

			double result = Math.sin(x) + Math.log(y) - Math.cos(z);

			System.out.println("Result of the complex mathematical computation: " + result);
		} catch (NullPointerException e) {
			System.out.println(
					"Error: NullPointerException occurred. Please ensure all required values are initialized.");
		}
	}
}
