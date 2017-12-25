package Thread02.Thread2_1_6_2;

public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
