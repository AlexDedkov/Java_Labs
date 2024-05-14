package lab.java.basics.lab_1_threads;

// 1,2 задание, класс запуска

public class MultiThread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new PrintingThread();
            System.out.println("Поток " + i + ": состояние перед запуском: " + thread.getState());
            thread.start();
        }
    }
}

