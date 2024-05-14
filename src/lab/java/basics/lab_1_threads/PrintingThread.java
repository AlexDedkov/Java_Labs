package lab.java.basics.lab_1_threads;

// 1,2 задание, класс с логикой
public class PrintingThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Состояние после запуска: " + this.getState());
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            System.out.println(Thread.currentThread().getName() + ": Состояние во время выполнения: " + this.getState());
            while (System.currentTimeMillis() - startTime < (i + 1) * 10) {
            }
        }
    }
}
