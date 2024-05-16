
public class Q13 {
	public static void main(String[] args) {
		double x = 0.5;
		try {
			double expressionResult = (Math.sin(x) * Math.cos(x)) / (Math.sin(x) + Math.cos(x));
			System.out.println("Result: " + expressionResult);
		} catch (ArithmeticException e) {
			System.out.println("Error: Arithmetic exception occurred - " + e.getMessage());
		}
	}
}
