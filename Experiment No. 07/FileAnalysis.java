import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAnalysis {
    public static void main(String[] args) {

        int vowels = 0;
        int words = 0;
        int countA = 0;

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("sample.txt"));  // file in same folder or give path

            String line;

            while ((line = br.readLine()) != null) {

                // Count words
                String[] w = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += w.length;
                }

                // Convert to lowercase
                line = line.toLowerCase();

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);

                    // Count vowels
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    }

                    // Count 'a'
                    if (ch == 'a') {
                        countA++;
                    }
                }
            }

            br.close();

            System.out.println("Total Vowels: " + vowels);
            System.out.println("Total Words: " + words);
            System.out.println("Count of 'a': " + countA);

        } catch (IOException e) {
            System.out.println("Error reading file!");
        }
    }
}