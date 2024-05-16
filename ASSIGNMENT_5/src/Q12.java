
public class Q12 {

	public static void main(String[] args) {
		double x = 0.5;
		try {

			if (Math.abs(Math.tan(x)) < 1e-9 || Math.sin(x) * Math.cos(x) < 0)
				throw new Exception("Error: Division by zero or negative value inside square root.");
			double result = Math.sqrt(Math.abs(Math.sin(x) * Math.cos(x))) / (Math.tan(x) + 1);
			System.out.println("Result: " + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
