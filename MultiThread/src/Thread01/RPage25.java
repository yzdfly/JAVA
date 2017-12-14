package Thread01;

public class RPage25 {
    public static void main(String[] args){
        try{
            CPage23 thread = new CPage23();
            thread.start();
            thread.sleep(1000);
            thread.interrupt();
            System.out.println("stop 1 " + thread.isInterrupted());
            System.out.println("stop 2 " + thread.isInterrupted());
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
