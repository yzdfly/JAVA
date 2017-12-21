package Thread02.Thread2_1_4;

public class ThreadA extends Thread {
    private MyObject object;
    public ThreadA(MyObject object){
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
