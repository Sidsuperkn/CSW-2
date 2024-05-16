public class Q18 {
	public static void traverseArray(int arr[], int index) {
		if (index < 0 || index >= arr.length) 
			throw new ArrayIndexOutOfBoundsException("Array index out of bound.");
		System.out.println("Element at index " + index + ": " + arr[index]);
		traverseArray(arr, index + 1);
	}

	public static void main(String[] args) {
		try {
			traverseArray(new int[] {1, 2, 3}, 10);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
