import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class _2241019447_Ass8_Q3 {
    public static void main(String[] args) {
        String fileName = "diary.txt";

        try {
            FileWriter writer = new FileWriter(fileName, true);

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentDate = dateFormat.format(new Date());

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your new diary entry:");
            String newEntry = sc.nextLine();

            writer.write("\nDate: " + currentDate + "\n");
            writer.write("Entry: " + newEntry + "\n");

            writer.close();
            sc.close();

            System.out.println("New diary entry has been successfully added to '" + fileName + "'.");

        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }
}
