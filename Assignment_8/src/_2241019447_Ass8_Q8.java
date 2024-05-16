import java.io.File;
import java.util.Scanner;

public class _2241019447_Ass8_Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the current file name:");
        String currentFileName = sc.nextLine();

        File currentFile = new File(currentFileName);

        if (!currentFile.exists() || !currentFile.isFile()) {
            System.out.println("The specified file does not exist.");
            return;
        }

        System.out.println("Enter the new file name:");
        String newFileName = sc.nextLine();

        File newFile = new File(newFileName);

        if (currentFileName.equals(newFileName)) {
            System.out.println("The new file name is the same as the current file name.");
            return;
        }

        if (newFile.exists()) {
            System.out.println("A file with the new name already exists.");
            return;
        }

        if (currentFile.renameTo(newFile)) {
            System.out.println("File successfully renamed from '" + currentFileName + "' to '" + newFileName + "'.");
        } else {
            System.out.println("Failed to rename the file.");
        }

        sc.close();
    }
}
