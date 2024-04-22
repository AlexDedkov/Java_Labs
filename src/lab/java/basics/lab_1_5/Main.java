package lab.java.basics.lab_1_5;

public class Main {
    public static void main(String[] args) {
        //1.1
        String s = "Testing this longest word method";
        longestWord(s);

        //1.2

        String pal = "казак";
        System.out.println("Слово палиндром?: " + palindromeCheck(pal));

        //1.3
        String bad = "Здесь только хорошие слова но есть бяка а еще есть еще одна бяка";
        String fixed = fixBadWords(bad);
        System.out.println(fixed);

        //1.4

        String first = "Вот первая строка";
        String second = "Вот вторая строка + Вот первая строка";
        int count = countOccurrences(first, second);
        System.out.println("Первая строка содержится " + count + " раз во второй");

        //1.5
        String inputString = "This is a test string";
        System.out.println("The given string is: " + inputString);
        System.out.println("The string reversed word by word is:");
        System.out.println(reverseWords(inputString));

    }

    public static String reverseWords(String input) {

        String[] words = input.split("\\s+");


        StringBuilder reversedString = new StringBuilder();


        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedString.append(reversedWord).append(" ");
        }

        return reversedString.toString().trim();
    }


    public static int countOccurrences(String first, String second) {
        int count = 0;
        int index = 0;
        while ((index = second.indexOf(first, index)) != -1) {
            count++;
            index += first.length();
        }

        return count;
    }

    private static String fixBadWords(String bad) {
        String regex = "бяка";

        String fixed = bad.replaceAll(regex, "[вырезано цензурой]");

        return fixed;
    }

    private static boolean palindromeCheck(String pal) {
        int length = pal.length();
        for (int i = 0; i < (pal.length() / 2); i++) {
            if (pal.charAt(i) != pal.charAt(length - i - 1)) {
                return false;
            }

        }
        return true;
    }

    private static void longestWord(String s) {
        String[] word = s.split(" ");
        String tmp = " ";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= tmp.length()) {
                tmp = word[i];
            }
        }
        System.out.println(tmp);
        System.out.println(tmp.length());
    }

}
