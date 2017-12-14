package Thread01;

public class RPage17 {
    public static void main(String[] aegs){
        CPage17 thread = new CPage17();
        Thread run = new Thread(thread);
        run.setName("run");
        run.start();
    }
}
