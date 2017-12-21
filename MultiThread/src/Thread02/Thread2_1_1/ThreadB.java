package Thread02.Thread2_1_1;

public class ThreadB extends Thread {
    private HasSelfPrivateNum instance;
    public ThreadB(HasSelfPrivateNum instance){
        super();
        this.instance = instance;
    }

    @Override
    public void run() {
        super.run();
        instance.addI("b");
    }
}
