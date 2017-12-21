package Thread01.Thread1_11;

public class Run {
    public static void main(String[] args){
        try {
            CPage50 thread = new CPage50();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("Main had stop");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
