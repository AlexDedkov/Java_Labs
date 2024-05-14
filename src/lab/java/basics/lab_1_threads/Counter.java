package lab.java.basics.lab_1_threads;

//3 Задание данный класс

public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
