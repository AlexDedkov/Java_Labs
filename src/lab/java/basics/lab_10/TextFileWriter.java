package lab.java.basics.lab_10;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {
    public static void writeToFile(String filePath, String content) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String filePath = "src/lab/java/basics/lab_10/Text2.txt";
        String content = "Это строка, которую нужно записать в файл.";
        writeToFile(filePath, content);
        System.out.println("Строка записана в файл.");
    }
}