package Thread01;

public class Login02 extends Thread {
    @Override
    public void run() {
        LoginThread.dopost("b","bb");
    }
}
