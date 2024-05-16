import java.io.*;

public class Q23 {

	public static void main(String[] args) {
		String filename = "data.txt";

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();
		} catch (IOException e) {
			System.err.println("An error occurred while reading the file");
		}
	}

}
