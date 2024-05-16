import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

public class _2241019447_Ass8_Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name:");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (!file.exists() || !file.isFile()) {
            System.out.println("The specified file does not exist.");
            return;
        }

        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Last Modified Date: " + dateFormat.format(new Date(file.lastModified())));

        System.out.println("Is Readable: " + file.canRead());
        System.out.println("Is Writable: " + file.canWrite());
        System.out.println("Is Executable: " + file.canExecute());

        sc.close();
    }
}
