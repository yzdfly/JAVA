package Thread01;

public class Run05 {
    public static void main(String[] args){
        Runnable runnable = new MyThread05();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Main is running");
    }
}
