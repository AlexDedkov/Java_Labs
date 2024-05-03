package lab.java.basics.lab_10;

import java.io.*;

public class CharacterReplacement {
    public static void replaceNonAlphanumeric(String filePath) {
        try {
            File inputFile = new File(filePath);
            FileReader reader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            StringBuilder stringBuilder = new StringBuilder();
            int character;

            while ((character = bufferedReader.read()) != -1) {
                if (Character.isLetterOrDigit(character)) {
                    stringBuilder.append((char) character);
                } else {
                    stringBuilder.append('$');
                }
            }
            bufferedReader.close();

            FileWriter writer = new FileWriter(inputFile);
            writer.write(stringBuilder.toString());
            writer.close();

            System.out.println("Замена завершена.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "src/lab/java/basics/lab_10/TextReplace.txt";
        replaceNonAlphanumeric(filePath);
    }
}
