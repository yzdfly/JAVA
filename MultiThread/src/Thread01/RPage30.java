package Thread01;

public class RPage30 {
    public static void main(String[] args){
        System.out.println("main start");
        try{
            CPage30 thread = new CPage30();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}
