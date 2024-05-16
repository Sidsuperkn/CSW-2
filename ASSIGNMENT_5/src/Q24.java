import java.io.*;

public class Q24 {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader(new File("a.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("The file was not found.");
		}
	}

}
