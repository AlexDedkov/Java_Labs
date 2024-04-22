package lab.java.basics.lab_1_6.ex1and2;

//1.2

public interface BankWorkerInter {
    void performDuties();

    default void greet() {
        System.out.println("Welcome to our bank!");
    }
}
