package Thread01.Thread1_10_1;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority = " + Thread.currentThread().getPriority());
    }
}
