package Thread01.Thread1_10_1;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority = " + Thread.currentThread().getPriority());
        MyThread2 thread = new MyThread2();
        thread.start();
    }
}
