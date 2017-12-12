package Thread01;

/**
 * Page 11
 */
public class MyThread07 extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println(Thread.currentThread().getName()+"'s count is " + count);
    }
}
