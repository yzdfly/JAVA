package Thread01;

/**
 * Page14
 */
public class MyThread08 extends Thread {
    private int i = 5;

    @Override
    public void run() {
        System.out.println("i = " + i-- + ";ThreadName = " + Thread.currentThread().getName());
    }
}
