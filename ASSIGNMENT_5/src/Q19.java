import java.util.Arrays;

public class Q19 {

	public static void main(String[] args) {
		int[] numbers = { 5, 2, 9, 1, 7 };

		Arrays.sort(numbers);
		System.out.println("Sorted array: " + Arrays.toString(numbers));

		int target = 9;
		int index = Arrays.binarySearch(numbers, target);
		if (index >= 0) {
			System.out.println("Element " + target + " found at index " + index);
		} else {
			System.out.println("Element " + target + " not found in the array");
		}

		try {
			System.out.println("Element at index 10: " + numbers[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
