package Thread01;

public class CPage17 extends Thread {
    public CPage17(){
        System.out.println("CPage17==========begin");
        System.out.println("CPage17 Thread.currentThread.getName() "+ Thread.currentThread().getName());
        System.out.println("CPage17 this.getName() "+ this.getName());
        System.out.println("CPage17==========end");
    }

    public void run(){
        System.out.println("run==========begin");
        System.out.println("run Thread.currentThread.getName() "+ Thread.currentThread().getName());
        System.out.println("run this.getName() "+ this.getName());
        System.out.println("run==========end");
    }
}
