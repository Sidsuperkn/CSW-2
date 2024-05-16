
public class Q14 {

	public static void main(String[] args) {
		double x = 5;

		try {
			double sinValue = Math.sin(x);
			double cosValue = Math.cos(x);
			double tanValue = Math.tan(x);
			double cotValue = 1 / tanValue;

			double sinPlusCos = sinValue + cosValue;
			double expressionResult = Math.log(Math.abs(sinPlusCos)) / (tanValue - cotValue);
			System.out.println("Result: " + expressionResult);
		} catch (ArithmeticException e) {
			System.out.println("Error: Arithmetic exception occurred - " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Error: Illegal argument - " + e.getMessage());
		}
	}

}
