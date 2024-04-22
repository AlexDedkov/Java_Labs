package lab.java.basics.lab_1_6.ex5;

//1.5

import java.util.Scanner;

class MainAge {
    Scanner newscanner = new Scanner(System.in);

    public void getStuff() {
        System.out.println("Enter your age");
        String age = newscanner.nextLine();
    }

    public static void main(String[] args) {
        DescendantAge childOne = new DescendantAge();
        childOne.getStuff();
    }
}