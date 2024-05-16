public class Q16 {
	public static void main(String[] args) {
		try {
			int[] numbers = new int[3];
			System.out.println("Element at index 5: " + numbers[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index out of bounds - " + e.getMessage());
		}
	}
}
