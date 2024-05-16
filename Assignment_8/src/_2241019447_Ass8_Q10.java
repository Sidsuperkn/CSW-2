import java.io.File;
import java.util.Scanner;

public class _2241019447_Ass8_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the directory path:");
        String directoryPath = sc.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            return;
        }

        System.out.println("\nContents of Directory: " + directory.getAbsolutePath());
        listFilesRecursively(directory, 0);

        sc.close();
    }

    static void listFilesRecursively(File directory, int depth) {
        File[] filesAndDirs = directory.listFiles();
        if (filesAndDirs != null) {
            for (File fileOrDir : filesAndDirs) {
                for (int i = 0; i < depth; i++) {
                    System.out.print("  ");
                }
                System.out.println(fileOrDir.getName());
                if (fileOrDir.isDirectory()) {
                    listFilesRecursively(fileOrDir, depth + 1);
                }
            }
        }
    }
}
