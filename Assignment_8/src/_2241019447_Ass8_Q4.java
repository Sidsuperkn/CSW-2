import java.util.*;
import java.io.*;

public class _2241019447_Ass8_Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the directory path:");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            return;
        }

        File[] filesAndDirs = directory.listFiles();
        if (filesAndDirs != null) {
            System.out.println("\nFiles and Subdirectories in '" + directory.getAbsolutePath() + "':");
            for (File fileOrDir : filesAndDirs) {
                if (fileOrDir.isFile()) {
                    System.out.println("File: " + fileOrDir.getName());
                } else if (fileOrDir.isDirectory()) {
                    System.out.println("Directory: " + fileOrDir.getName());
                }
            }
        } else {
            System.out.println("An error occurred while listing files and directories.");
        }

        scanner.close();
    }
}
