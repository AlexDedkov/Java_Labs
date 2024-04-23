package lab.java.basics.lab_1_6.ex4;

//1.4

public class DescendantClass extends MainClass {
    public DescendantClass(int integer) {
        super(integer);
    }

    public void displayVariable() {
        System.out.println("Variable from MainClass: " + integer);
    }
}
