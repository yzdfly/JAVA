package Thread01;

public class MyThread04 extends Thread {
    private int i;
    public MyThread04(int i){
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
