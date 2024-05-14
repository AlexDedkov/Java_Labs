package lab.java.basics.lab_1_threads;

//3 задание, класс с инкрементом

public class IncrThread extends Thread{
    private Counter counter;

    public IncrThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
