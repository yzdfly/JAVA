package Thread01;

public class CPage18 extends Thread {
    @Override
    public void run() {
        System.out.println("run = " + this.isAlive());
    }
}
