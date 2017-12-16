package Thread01.Thread1_10_1;

public class Run {
    public static void main(String[] args){
        System.out.println("Main Thread begin priority = " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("Main Thread end priority = " + Thread.currentThread().getPriority());
        MyThread1 thread = new MyThread1();
        thread.start();
    }
}
