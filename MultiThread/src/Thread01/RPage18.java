package Thread01;

public class RPage18 {
    public static void main(String[] args){
        CPage18 thread = new CPage18();
        System.out.println("begin = "+thread.isAlive());
        thread.start();
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("error");
        }
        System.out.println("end = "+thread.isAlive());
    }
}
