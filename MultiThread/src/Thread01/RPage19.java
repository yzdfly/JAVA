package Thread01;

public class RPage19 {
    public static void main(String args[]){
        CPage19 thread = new CPage19();
        Thread test = new Thread(thread);
        System.out.println("main begin test isAlive is " + test.isAlive());
        test.setName("test");
        test.start();

        System.out.println("main end test isAlive is " + test.isAlive());
    }
}
