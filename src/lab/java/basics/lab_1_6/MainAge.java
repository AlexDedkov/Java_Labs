package lab.java.basics.lab_1_6;

//1.5

import java.util.Scanner;

class MainAge {
    Scanner newscanner = new Scanner(System.in);

    public String getStuff() {
        System.out.println("Enter your age");
        String age = newscanner.nextLine();
        return age;
    }

    public static void main(String[] args) {
        DescendantAge childOne = new DescendantAge();
        System.out.println(childOne.getStuff());
    }
}