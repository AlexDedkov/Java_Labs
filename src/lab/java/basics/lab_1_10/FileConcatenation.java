package lab.java.basics.lab_1_10;

import java.util.List;

import static lab.java.basics.lab_1_10.TextFileReader.readFile;

public class FileConcatenation {
    public static void concatenateFiles(String filePath1, String filePath2, String outputPath) {
        List<String> file1Content = readFile(filePath1);
        List<String> file2Content = readFile(filePath2);

        StringBuilder combinedContent = new StringBuilder();
        for (String line : file1Content) {
            combinedContent.append(line).append("\n");
        }
        for (String line : file2Content) {
            combinedContent.append(line).append("\n");
        }

        TextFileWriter.writeToFile(outputPath, combinedContent.toString());
        System.out.println("Файлы объединены.");
        printInfo();
    }

    public static void main(String[] args) {
        String filePath1 = "src/lab/java/basics/lab_1_10/Text.txt";
        String filePath2 = "src/lab/java/basics/lab_1_10/Text2.txt";
        String outputPath = "src/lab/java/basics/lab_1_10/TextFinal.txt";
        concatenateFiles(filePath1, filePath2, outputPath);
    }

    public static void printInfo(){
        String filePath = "src/lab/java/basics/lab_1_10/TextFinal.txt";
        List<String> fileContent = readFile(filePath);
        for (String line : fileContent) {
            System.out.println(line);
        }
    }
}
