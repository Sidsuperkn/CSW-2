
public class Q28 {
	public static void recursiveMethod(int i) {
		System.out.println("Calling recursive method with i " + i);
		recursiveMethod(i + 1);
	}
	public static void main(String[] args) {
		try {
			recursiveMethod(0);
		} catch (StackOverflowError e) {
			System.out.println("StackOverFlowError Caught.");
		}
	}

}
