package lab.java.basics.lab1_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        //1.2

        resultFirst();
        resultSecond();

        //1.3

        double x = 10500.0;
        double y1 = 10.0;
        double result1 = (x / y1) / y1;
        System.out.println(result1);

        //1.4

        double x1 = 3.6;
        double y = 4.1;
        double z = 5.9;

        double result = x1 * y * z;
        System.out.println(result);

        //1.5

        Scanner resultScan = new Scanner(System.in);
        int h1 = resultScan.nextInt();
        int h2 = resultScan.nextInt();
        int h3 = resultScan.nextInt();
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        //1.6

        Scanner resultEvenOdd = new Scanner(System.in);
        int b = resultEvenOdd.nextInt();

        if (b % 2 ==0  && b < 100)
            System.out.println("Четное");

        else if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        }
        else if (b % 2 != 0 && b < 100) {
            System.out.println("Нечетное");
        }
    }

    //1.2 Methods
    public static void resultFirst (){
        double x = 46.0;
        double y = 10.0;
        double z = 3.0;
        double result = (x + y) * (y / z);
        System.out.println(result);
    }

    public static void resultSecond (){
        double c = 29.0;
        double v = 4.0;
        double b = -15.0;
        double result = c * v * b;
        System.out.println(result);

    }
}
