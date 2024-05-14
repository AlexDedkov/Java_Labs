package lab.java.basics.lab_1_threads;

//4 задание, 1-й поток

public class MyThreadFirst extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (Main.class) {
                System.out.println("Поток 1");
                try {
                    Main.class.notify();
                    Main.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
