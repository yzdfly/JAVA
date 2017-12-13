package Thread01;

public class Run08 {
    public static void main(String[] args) {
        Thread run = new MyThread08();
        Thread t1 = new Thread(run, "t1");
        Thread t2 = new Thread(run, "t2");
        Thread t3 = new Thread(run, "t3");
        Thread t4 = new Thread(run, "t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
