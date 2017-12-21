package Thread01.Thread1_10_2;

public class Run {
    public static void main(String[] args){
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        thread1.setPriority(10);
        thread2.setPriority(1);
        thread2.start();
        thread1.start();
    }
}
