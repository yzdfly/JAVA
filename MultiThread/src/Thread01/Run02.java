package Thread01;

/**
 * Page 5
 */
public class Run02 {
    public static void main(String[] args){
        MyThread02 thread = new MyThread02();
        thread.start();
        System.out.println("运行结束！");
    }
}
