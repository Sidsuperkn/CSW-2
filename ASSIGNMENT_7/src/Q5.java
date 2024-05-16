import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the base string:");
		String baseString = sc.nextLine();
		System.out.println("Enter the number of concatenations:");
		int repetitions = sc.nextInt();

		long startTimeStringBuilder = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < repetitions; i++) {
			stringBuilder.append(baseString);
		}
		long endTimeStringBuilder = System.currentTimeMillis();
		long durationStringBuilder = endTimeStringBuilder - startTimeStringBuilder;

		long startTimeStringBuffer = System.currentTimeMillis();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < repetitions; i++) {
			stringBuffer.append(baseString);
		}
		long endTimeStringBuffer = System.currentTimeMillis();
		long durationStringBuffer = endTimeStringBuffer - startTimeStringBuffer;

		System.out.println("Using StringBuilder...");
		System.out.println("Time taken: " + durationStringBuilder + " milliseconds");
		System.out.println("Final string length: " + stringBuilder.length());

		System.out.println("\nUsing StringBuffer...");
		System.out.println("Time taken: " + durationStringBuffer + " milliseconds");
		System.out.println("Final string length: " + stringBuffer.length());

		long difference = Math.abs(durationStringBuilder - durationStringBuffer);
		String faster = (durationStringBuilder < durationStringBuffer) ? "StringBuilder" : "StringBuffer";
		System.out
				.println("\nComparison: " + faster + " was faster than the other by " + difference + " milliseconds.");

		sc.close();

	}

}
