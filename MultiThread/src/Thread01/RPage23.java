package Thread01;

public class RPage23 {
    public static void main(String[] args){
        try{
            CPage23 thread = new CPage23();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
