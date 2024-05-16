import java.io.*;
import java.util.Scanner;

public class _2241019447_Ass8_Q2 {
    public static void main(String[] args) {
        String fileName = "diary.txt";
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("The file '" + fileName + "' does not exist.");
            return;
        }
        try {
            Scanner sc = new Scanner(file);
            System.out.println("Contents of '" + fileName + "':");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading from the file: " + e.getMessage());
        }
    }
}
