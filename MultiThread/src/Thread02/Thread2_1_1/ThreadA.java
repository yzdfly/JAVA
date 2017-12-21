package Thread02.Thread2_1_1;

public class ThreadA extends Thread {
    private HasSelfPrivateNum instance;
    public ThreadA(HasSelfPrivateNum instance){
        super();
        this.instance = instance;
    }

    @Override
    public void run() {
        super.run();
        instance.addI("a");
    }
}
