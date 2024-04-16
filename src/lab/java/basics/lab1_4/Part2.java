package lab.java.basics.lab1_4;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
// 2.1       int[] arr = {3, -3, 7, 4, 5, 4, 3};
//        System.out.println(Arrays.toString(arr));
//        arraySortedCheck(arr);

// 2.2        arrayCreate();

//  2.3      int[] arr = {5, 6, 7, 2};
//        arrayMix(arr);

        //2.4
        int[] arr = {1, 2, 3, 1, 2, 4};
        arrayUnique(arr);

    }

    //2.4
    private static void arrayUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("Первое уникальное число : " + arr[i]);
                break;
            } else {
            }
        }
    }

    //2.3
    private static void arrayMix(int[] arr) {
        int x = arr[0];
        int y = arr[arr.length - 1];
        arr[0] = y;
        arr[arr.length - 1] = x;
        System.out.println(Arrays.toString(arr));
    }


    //2.1
    private static void arraySortedCheck(int[] arr) {
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please try again");
        }
    }

    //2.2
    private static void arrayCreate() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Array length: ");
        Integer length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(arr));

    }
}
