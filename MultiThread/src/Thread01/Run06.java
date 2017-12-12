package Thread01;

public class Run06 {
    public static void main(String[] mian)
    {
        MyThread06 thread1 = new MyThread06("thread1");
        MyThread06 thread2 = new MyThread06("thread2");
        MyThread06 thread3 = new MyThread06("thread3");
        MyThread06 thread4 = new MyThread06("thread4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
