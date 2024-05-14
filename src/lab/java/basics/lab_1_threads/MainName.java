package lab.java.basics.lab_1_threads;

//4 задание, класс запуска

public class MainName {
    public static void main(String[] args) {
        MyThreadFirst thread1 = new MyThreadFirst();
        MyThreadSecond thread2 = new MyThreadSecond();

        thread1.start();
        thread2.start();
    }
}
