package lab.java.basics.lab_1_threads;

//4 задание, 2-ой поток

public class MyThreadSecond extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (Main.class) {
                System.out.println("Поток 2");
                try {
                    Main.class.notify();
                    if (i < 4) {
                        Main.class.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
