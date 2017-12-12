package Thread01;

public class Login01 extends Thread {
    @Override
    public void run() {
        LoginThread.dopost("a","aa");
    }
}
