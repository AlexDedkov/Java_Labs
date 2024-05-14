package lab.java.basics.lab_1_threads;
import java.util.concurrent.CountDownLatch;


//3 задание класс с основной логикой

public class ThreadManager {
    public static void execute() throws InterruptedException {
        final Counter counter = new Counter();
        final CountDownLatch latch = new CountDownLatch(100);

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
                latch.countDown();
            }).start();
        }

        latch.await();

        System.out.println("Count: " + counter.getCount());
    }
}
