import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class _2241019447_Ass8_Q1 {

	public static void main(String[] args) {
		File file = new File("diary.txt");

		if (file.exists()) {
			System.out.println("The file 'diary.txt' already exists.");
			return;
		} else {
			System.out.println("Creating a new file 'diary.txt'...");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your diary entry:");
		String entry = sc.nextLine();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentDate = dateFormat.format(new Date());

		try {
			FileWriter writer = new FileWriter(file, true);
			writer.write("\nDate: " + currentDate + "\n");
			writer.write("Entry: " + entry + "\n");
			writer.close();
			System.out.println("Diary entry has been successfully added to 'diary.txt'.");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file: " + e.getMessage());
		}
		sc.close();

	}

}
