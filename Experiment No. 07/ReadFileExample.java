import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            // Create file object (keep file in same folder)
            File file = new File("sample.txt");

            // ✅ Debug lines (to check path and existence)
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("File exists: " + file.exists());

            // Read file
            Scanner sc = new Scanner(file);

            System.out.println("\nFile Content:\n");

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}