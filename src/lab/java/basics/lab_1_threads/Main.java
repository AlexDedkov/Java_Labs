package lab.java.basics.lab_1_threads;

//3 задание класс запуска

public class Main {
    public static void main(String[] args) {
        try {
            ThreadManager.execute();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
