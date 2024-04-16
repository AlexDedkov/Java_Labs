package lab.java.basics.lab1_4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, -3, 7, 4, 5, 4, 3};
        boolean result;

// 1.1       counterTo();

//  1.2      counterOdd();


//  1.3      counterFull();

//
//  1.4      result = counterFirstAndThird();
//
//        System.out.println("Результат: " + result);

//

//
//   1.5     result = arrayCheckFirst(arr);
//        System.out.println("Результат: " + result);

//   1.6     System.out.println(Arrays.toString(arr));
//        result = arrayCheckFull(arr);
//        System.out.println("Результат: " + result);

    }


    //1.1
    public static void counterTo() {
        for (int i = 1; i <= 99; i++) {
            System.out.println(i);

        }
    }

    //1.2
    public static void counterOdd() {
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Делится на 5: " + i);
            }

        }
    }

    //1.3
    public static boolean counterFull() {
        Integer first;
        Integer second;
        Integer summ;

        boolean result = false;

        Scanner resultScan = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        first = resultScan.nextInt();
        System.out.printf("Введите второе число: ");
        second = resultScan.nextInt();
        System.out.printf("Введите третье число: ");
        summ = resultScan.nextInt();
        resultScan.close();

        Integer test = first + second;
        if (test == summ) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //1.4
    public static boolean counterFirstAndThird() {
        Integer first;
        Integer second;
        Integer third;
        boolean result = false;

        Scanner resultScan = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        first = resultScan.nextInt();
        System.out.printf("Введите второе число: ");
        second = resultScan.nextInt();
        System.out.printf("Введите третье число: ");
        third = resultScan.nextInt();
        resultScan.close();

        if (second > first && third > second) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //1.5
    public static boolean arrayCheckFirst(int[] arr) {
        boolean result = false;
        Integer firstNum = arr[0];
        Integer lastNum = arr[arr.length - 1];
        if (firstNum == 3 || lastNum == 3) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //1.6
    public static boolean arrayCheckFull(int[] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 3 || i == 5) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

}
