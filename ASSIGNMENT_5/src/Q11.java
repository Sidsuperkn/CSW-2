public class Q11 {
    public static void main(String[] args) {
        try {
            double x = 1;
            double numerator = Math.log(Math.sin(x) + Math.cos(x));
            double denominator = Math.tan(x) - (1 / Math.tan(x));
            if (denominator == 0) 
                throw new ArithmeticException("Division by zero error: tan(x) - cot(x) is zero.");
            double result = numerator / denominator;
            System.out.println("Result of the function for : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
