package lab.java.basics.lab_1_10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileReader {
    public static List<String> readFile(String filePath) {
        List<String> lines = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return lines;
    }

    public static void main(String[] args) {
        String filePath = "src/lab/java/basics/lab_1_10/Text.txt";
        List<String> fileContent = readFile(filePath);
        for (String line : fileContent) {
            System.out.println(line);
        }
    }
}
