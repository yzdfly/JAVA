package Thread01;

/**
 * 共享资源的非线程保护
 */
public class Run07 {
    public static void main(String[] args){
        MyThread07 thread = new MyThread07();
        Thread a = new Thread(thread,"A");
        Thread b = new Thread(thread,"B");
        Thread c = new Thread(thread,"C");
        Thread d = new Thread(thread,"D");
        a.start();
        b.start();
        c.start();
        d.start();
    }
}
