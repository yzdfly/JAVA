package Thread01;

public class CPage19 extends Thread {
    public CPage19(){
        System.out.println("CPage19------begin");
        System.out.println("CPage19 Thread.currentThread.getName() = "
                + Thread.currentThread().getName());
        System.out.println("CPage19 Thread.currentThread.isAlive() = "
        + Thread.currentThread().isAlive());
        System.out.println("CPage19 this.getName() = "
                + this.getName());
        System.out.println("CPage19 this.isAlive() = "
        + this.isAlive());

        System.out.println("CPage19------end");
    }

    @Override
    public void run() {
        System.out.println("run------begin");
        System.out.println("run Thread.currentThread.getName() = "
                + Thread.currentThread().getName());
        System.out.println("run Thread.currentThread.isAlive() = "
                + Thread.currentThread().isAlive());
        System.out.println("run this.getName() = "
                + this.getName());
        System.out.println("run this.isAlive() = "
                + this.isAlive());

        System.out.println("run------end");
    }
}
