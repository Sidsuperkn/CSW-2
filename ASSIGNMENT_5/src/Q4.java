import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;

public class Q4 {

	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			System.out.println("Please provide a valid path.");
			return;
		}
		String filepath = args[0];
		File file = new File(filepath);
		if (!file.exists()) 
			throw new CustomNullPointerException("File not found" + filepath);
		try {
			FileReader reader = new FileReader(filepath);
			System.out.print("contents: ");
			int charvalue;
			while ((charvalue = reader.read()) != -1) {
				System.out.print((char) charvalue);
			}
			reader.close();
		} catch (IOException e) {
			throw new CustomFileReadPermissionException("File access denied");
		}
	}

}

class CustomNullPointerException extends FileNotFoundException {
	public CustomNullPointerException(String message) {
		super(message);
	}
}

class CustomFileReadPermissionException extends Exception {
	public CustomFileReadPermissionException(String message) {
		super(message);
	}
}