package Thread01;

public class CPage16 extends Thread {
    public CPage16(){
        System.out.println("Init " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run " + Thread.currentThread().getName());
    }
}
