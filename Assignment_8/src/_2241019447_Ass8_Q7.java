import java.io.*;
import java.util.Scanner;

public class _2241019447_Ass8_Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the source file path:");
        String sourceFilePath = scanner.nextLine();

        File sourceFile = new File(sourceFilePath);

        if (!sourceFile.exists() || !sourceFile.isFile()) {
            System.out.println("The source file does not exist.");
            return;
        }

        System.out.println("Enter the destination file path:");
        String destinationFilePath = scanner.nextLine();

        File destinationFile = new File(destinationFilePath);

        if (destinationFile.exists()) {
            System.out.println("The destination file already exists.");

            System.out.println("Do you want to overwrite the destination file? (yes/no)");
            String confirmation = scanner.nextLine().toLowerCase();

            if (confirmation.equals("no")) {
                System.out.println("Copy operation aborted.");
                return;
            }
        }

        try {
            FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(destinationFile);
            char[] buffer = new char[1024];
            int bytesRead;

            while ((bytesRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, bytesRead);
            }

            System.out.println("Content copied from '" + sourceFilePath + "' to '" + destinationFilePath + "'.");
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred during the copy operation: " + e.getMessage());
        }

        scanner.close();
    }
}
