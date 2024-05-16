import java.util.Scanner;
import java.io.File;

public class _2241019447_Ass8_Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file to delete:");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File '" + fileName + "' has been successfully deleted.");
            } else {
                System.out.println("Failed to delete the file '" + fileName + "'.");
            }
        } else {
            System.out.println("The file '" + fileName + "' does not exist.");
        }

        scanner.close();
    }
}
